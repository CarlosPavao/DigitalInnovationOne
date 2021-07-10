package DesenvolvimentoAvançado.AssincronoEParalelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    private static final ExecutorService PessoasParaExecultarAtividades = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());

        List<? extends Future<String>> futuros =
                new CopyOnWriteArrayList<>(casa.obterAfazeresDaCasa().stream()
                .map(atividade -> PessoasParaExecultarAtividades.submit(() -> {
                        try {
                            return atividade.realizar();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return null;
                })
                ).collect(Collectors.toList()));


        while (true){
            int numeroDeAtividadesNaoFinalizadas = 0;
            for (Future<?> futuro : futuros) {
                if (futuro.isDone()){
                    try {
                        System.out.println("Parabens voce terminou de "+futuro.get());
                        futuros.remove(futuro);
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numeroDeAtividadesNaoFinalizadas++;
                }
            }
            if (futuros.stream().allMatch(Future::isDone)){
                break;
            }
            System.out.println("Numero de atividades nao finalizadas :: "+numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }
        PessoasParaExecultarAtividades.shutdown();
    }
}

class Casa{
    private List<Comodo> comodos;

    Casa(Comodo... comodos){
        this.comodos = Arrays.asList(comodos);
    }
    List<Atividade> obterAfazeresDaCasa(){
        return  this.comodos.stream().map(Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<Atividade>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }
}

interface Atividade{
    String realizar() throws InterruptedException;
}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo{

    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::getArrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
        
    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        String GuardaRoupa = "Arrumar o Guarda Roupa";
        System.out.println(GuardaRoupa);
        return GuardaRoupa;
    }

    private String getArrumarACama() throws InterruptedException {
        Thread.sleep(7000);
        String casa = "Arruma a Cama";
        System.out.println(casa);
        return casa;
    }

    private String varrerOQuarto() throws InterruptedException {
        Thread.sleep(10000);
        String quarto = "Varrer o quarto";
        System.out.println(quarto);
        return quarto;
    }
}

