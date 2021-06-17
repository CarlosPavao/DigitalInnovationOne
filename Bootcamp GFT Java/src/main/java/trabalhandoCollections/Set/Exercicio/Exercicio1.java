package trabalhandoCollections.Set.Exercicio;
/*
*
* Crie um conjunto contendo as cores do arco-íris e:
* Exiba todas as cores uma abaixo da outra
* A quantidade de cores que o arco-íris tem
* Exiba as cores em ordem alfabética
* Exiba as cores na ordem inversa da que foi informada
* Exiba todas as cores que começam com a letra ”v”
* Remova todas as cores que não começam com a letra “v”
* Limpe o conjunto
* Confira se o conjunto está vazio
*/


import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");

        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");

        System.out.println(coresArcoIris);
        /*
        Iterator<String> cores = coresArcoIris.iterator();
        while (cores.hasNext()){
            String cor = cores.next();
            System.out.println(cor);
        }
         */
        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }



    }
}
