package DesenvolvimentoAvançado.InterfacesFuniconal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Carlos","Henrique","Pavão","Inacio", "Carlos"};
        Integer[] numeros = {1,2,3,4,5,6};

        imprimirNomesFiltrados(nomes);
        imprimirTodosOsNomes(nomes);
        imprimirODobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("Desenvolvedor");
        profissoes.add("Testador");
        profissoes.add("Gerente de projeto");
        profissoes.add("Gerente de qualidade");

        profissoes.stream()
                .filter(profissao -> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    private static void imprimirTodosOsNomes(String... nomes) {

        for (String nome : nomes){
            System.out.println("Imprimido pelo For: "+nome);
        }
        System.out.println("Imprimido pelo ForEach:");
        Stream.of(nomes)
                .forEach(System.out::println);

    }

    //OS ... significa a mesma coisa que colocar o []
    private static void imprimirODobroDeCadaItemDaLista(Integer... numeros) {
        System.out.println("--- Número do FOR    ----");
        for (Integer numero : numeros){
            System.out.println(numero*2);
        }
        System.out.println("--- Número do ForEach   ----");

        Stream.of(numeros)
                .map(numero -> numero*2)
                .forEach(System.out::println);

    }

    private static void imprimirNomesFiltrados(String... nomes) {

        String nomesParaImprimir= "";
        for (int i = 0; i < nomes.length; i++){
            if (nomes[i].equals("Carlos")){
                nomesParaImprimir+= nomes[i];
            }
        }

        System.out.println("Nomes do for: "+nomesParaImprimir);

        String ImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("Carlos"))
                .collect(Collectors.joining());

        System.out.println("Nomes do Stream: "+ ImprimirDaStream);
    }
}
