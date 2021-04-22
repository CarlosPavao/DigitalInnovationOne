package CollectionsIII;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class ExercicioLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicione 5 números inteiros> 3,88,20,44,3
        sequenciaNumerica.add(3);
        sequenciaNumerica.add(88);
        sequenciaNumerica.add(20);
        sequenciaNumerica.add(44);
        sequenciaNumerica.add(3);

        //Navegue no Set exibindo cada número no console
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println("--->"+iterator.next());
        }
        for (Integer numero:sequenciaNumerica){
            System.out.println("-->"+numero);
        }
        //Remova o primeiro item do Set

        sequenciaNumerica.remove(3);
        System.out.println(sequenciaNumerica);

        //Adicione um novo número no SET: 23
        sequenciaNumerica.add(23);
        System.out.println(sequenciaNumerica);

        //Verifique se o Set está vazio
        System.out.println(sequenciaNumerica.isEmpty());

    }

}
