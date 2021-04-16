package CollectionsI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List<String>nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");

        System.out.println("Nomes na lista:"+nomes);

        //Ordenação por ordem alfabetica
        Collections.sort(nomes);
        System.out.println("Lista em ordem alfabetica:"+nomes);

        //Alterar elemento
        nomes.set(4,"Larissa");
        System.out.println("Alterando elemento 4-Larrisa: "+nomes);

        //Remover o indice
        nomes.remove(1);
        System.out.println("Removendo elemento pelo indice 1-Anderson: "+nomes);

        //Remove por nome
        nomes.remove("Maria");
        System.out.println("Removendo elemento pelo nome Maria: "+nomes);

        //Retornar um elemento especifico
        String nome = nomes.get(4);
        System.out.println("Retorna Elemento do Indice 4"+nome);

        //Retorna a quantidade de elementos da lista
        int tamanho = nomes.size();
        System.out.println("Retornando o tamanho da Lista:"+tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();
        System.out.println(tamanho);

        //Descobrir se tem valor na lista
        boolean temAna = nomes.contains("Ana");
        System.out.println("Tem Ana na lista: "+temAna);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println("Tem Anderson na lista: "+temAnderson);

        //Saber o indice de determinado elemento
        int posicao = nomes.indexOf("Carlos");
        System.out.println("Quando encontra retorna a posição:"+posicao);

        //Quan não encontra
        posicao = nomes.indexOf("Joana");
        System.out.println("Quando não encontra retorna:"+posicao);

        //Descobrir se a lista está vazia
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("A Lista está vazia:"+listaEstaVazia);

        //Percorrendo a lista
        for(String nomeDoItem:nomes){
            System.out.println("----->"+nomeDoItem);
        }

        //Outra foram de percorer a lista
        Iterator<String> iterator = nomes.iterator();

        while (iterator.hasNext()){
            System.out.println("------->"+iterator.next());
        }

        //Limpar a lista
        nomes.clear();

        listaEstaVazia = nomes.isEmpty();
        System.out.println("A Lista está vazia:"+listaEstaVazia);


    }


}
