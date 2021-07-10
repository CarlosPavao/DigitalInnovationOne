package trabalhandoCollections.Map.Exercicio;

import java.util.*;
/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("--------\tCrie um dicionário que relacione os estados e suas respectivas populações:\t--------");
        Map<String, Integer> estadosBrasileiros = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosBrasileiros.toString());

        System.out.println("--------\tSubstitua a população do estado RN por : 3.534.165\t--------");
        estadosBrasileiros.put("RN", 3534165);
        System.out.println(estadosBrasileiros);

        System.out.println("--------\tConfira se o estado da Paraíba (PB) tucson está no dicionário, caso não, adicione " +
                "PB - 4.039.277:\t-------- ");
        estadosBrasileiros.put("PB", 4039277);
        System.out.println(estadosBrasileiros);

        System.out.println("--------\tExiba a população do estado PE\t--------");
        System.out.println(estadosBrasileiros.get("PE"));

        System.out.println("--------\tExiba todos os estados e suas populaçãos na ordem em que foram informados\t--------");
        Map<String, Integer> estadosBrasileiros2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estadosBrasileiros2);

        System.out.println("--------\tExiba todos os estados e suas populações na ordem alfabética\t--------");
        Map<String, Integer> populacaoBrasileira = new TreeMap<>(estadosBrasileiros);
        System.out.println(populacaoBrasileira);

        Collection<Integer> populacao = populacaoBrasileira.values();
        String estadoMaiorPopulacao = "";
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoBrasileira.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenorPopulacao = entry.getKey();
        }

        System.out.println("--------\tExiba o estado com o menor população e seu respectivo valor\t--------");
        System.out.printf("menor população (%s) - respectivo valor (%d)\n",estadoMenorPopulacao, Collections.min(populacao) );

        System.out.println("--------\tExiba o estado com o maior população e seu respectivo valor\t--------");

        System.out.printf("maior população (%s) - respectivo valor (%d)\n",estadoMaiorPopulacao, Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoBrasileira.values().iterator();
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("--------\tExiba a soma da população desses estados\t--------");
        System.out.println(soma);

        System.out.println("--------\tExiba a média da população destes estados\t--------");
        System.out.println(soma / populacaoBrasileira.size());

        System.out.println("--------\tRemova os estados com a população menor que 4.000.000\t--------");
        Iterator<Integer> iterator1 = populacaoBrasileira.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoBrasileira);

        System.out.println("--------\tApague o dicionario de estados com suas respectivas populações estimadas\t--------");
        populacaoBrasileira.clear();
        System.out.println(populacaoBrasileira);

        System.out.println("--------\tConfira se a lista está vazia\t--------");
        System.out.println(populacaoBrasileira.isEmpty());

    }
}
