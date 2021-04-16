package CollectionsI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exercicio {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        //Adicione 5 nomes Juliana, Pedro,Carlos,Larissa, João
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //navegue na lista exibindo cada nome no console
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println("-->"+iterator.next());
        }

        //substitua o nome carlos por roberto
        nomes.set(2,"Roberto");

        //retorne o nome da posiçao 1
        System.out.println(nomes.get(1));

        //remova o nome da posição 4
        nomes.remove(4);

        //remova o nome joão
        nomes.remove("João");

        //retorne a quantidade de itens da lista.
        int tamanho = nomes.size();
        System.out.println(tamanho);

        //verifique se o nome juliano exite na lista
        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        //Criei uma nova lista com os nomes Ismael, Rodrigo, adicione todos os itens da nova lista na primeira lista criada

        List<String> novosNomes = new ArrayList<>();
        novosNomes.add("Ismael");
        novosNomes.add("Rodrigo");

        nomes.addAll(novosNomes);

        System.out.println(nomes);

        //Ordene os itens por ordem alfabetica
        Collections.sort(nomes);
        System.out.println(nomes);

        //verifique se a lista está vazia
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("A Lista está vazia:"+listaEstaVazia);
    }
}
/*



* */