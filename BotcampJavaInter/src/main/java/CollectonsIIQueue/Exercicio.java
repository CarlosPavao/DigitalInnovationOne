package CollectonsIIQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        // Adicione 5 nomes: Juliana, Pedro, Carlos, Larrisa , João
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");

        //Navegue na fila exibindo cada nome no console
        Iterator<String> iteratorFila = fila.iterator();
        while (iteratorFila.hasNext()){
            System.out.println(iteratorFila.next());
        }

        //Retorne o primeiro item da fila, sem removê-lo
        String proximoAtendimento = fila.peek();
        System.out.println("Primeiro da Fila"+proximoAtendimento);
        System.out.println("Fila atual"+fila);

        //Retorne o primeiro item da fila, removendo o mesmo
        String atendimento = fila.poll();
        System.out.println("Sendo atendido(a): "+atendimento);
        System.out.println("Fila atual"+fila);

        //Adicione um novo nome: Daniel.verifique a posição que o mesmo assumiu.
        fila.add("Daniel");

        System.out.println(fila.parallelStream());

        //retorne o tamanho da lista
        System.out.println("tem "+fila.size()+" na fila");


        //verifique se a lista está vazia.
        System.out.println(fila.isEmpty());

        //verifique se o nome Carlos está na lista
        System.out.println(fila.contains("Carlos"));



    }



}

