package CollectonsIIQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println("Fila abertura: "+filaBanco);

        //poll retorna e remove o primeiro elemento
        String clienteASerAtendido = filaBanco.poll();
        System.out.println("Cliente em atendimento: "+clienteASerAtendido);
        System.out.println("Após o primeiro atendimento: "+filaBanco);

        //pekk retorna mas não remove se a fila estiver vazia retorna null
        String primeiroCliente = filaBanco.peek();
        System.out.println("Proximo atendimentos: "+primeiroCliente);
        System.out.println(filaBanco);

        //Navegando na fila
        for (String cliente: filaBanco){
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println("---->"+iteratorFilaBanco.next());
        }

        //Tamanho da fila
        System.out.println(filaBanco.size());

        System.out.println(filaBanco.isEmpty());

        //Limpando a fila
        filaBanco.clear();



        //element retorna mas não remove porem se a fila está vazia retorna uma exceção
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println("Se a fila estiver vazia um erro será lançado"+primeiroClienteOuErro);
        System.out.println(filaBanco);



    }



}
