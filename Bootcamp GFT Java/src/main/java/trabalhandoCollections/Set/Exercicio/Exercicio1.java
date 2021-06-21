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
        System.out.println("--------------");
        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println("--------------");
        System.out.println("Quantidade de cores: "+coresArcoIris.size());

        System.out.println("--------------");
        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> ordemAlfabetica = new TreeSet<>(coresArcoIris);
        System.out.println(ordemAlfabetica);

        System.out.println("--------------");
        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris2 = new HashSet<>(Arrays.asList("Violeta","anil","azul","verde","amarelo","laranja","vermelho"));
        System.out.println(coresArcoIris2);

        System.out.println("--------------");
        System.out.println("Invertido: ");
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris2);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("--------------");
//      Exiba todas as cores que começam com a letra ”v”
        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("--------------");
        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("--------------");

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();
        
        System.out.println("--------------");

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());

    }
}
