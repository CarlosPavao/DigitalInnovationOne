package CollectionsIII;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adiciona os números no Set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);


        System.out.println(sequenciaNumerica);

        //Remove o número do Set
        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        //Retornar a quantidade de itens do SET
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Integer sequencia:sequenciaNumerica){
            System.out.println(sequencia);
        }

        //Retorna se o Set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());

    }
}
