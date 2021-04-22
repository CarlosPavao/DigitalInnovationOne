package CollectionsIV;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String,Integer> copaDoMundoFifa = new HashMap<>();

        //Adiciona os campões mundiais fifa no mapa
        copaDoMundoFifa.put("Brasil",5);
        copaDoMundoFifa.put("Alemanha",4);
        copaDoMundoFifa.put("Italia",4);
        copaDoMundoFifa.put("Uruguai",2);
        copaDoMundoFifa.put("França",2);
        copaDoMundoFifa.put("Inglaterra",1);
        copaDoMundoFifa.put("Espanha",1);

        System.out.println(copaDoMundoFifa);

        //Atualiza o valor para chave Brasil
        copaDoMundoFifa.put("Brasil", 6);
        System.out.println(copaDoMundoFifa);

        //Retorna a Argentina
        System.out.println(copaDoMundoFifa.get("Argentina"));

        //Retorna se existe ou não um campeão frança
        System.out.println(copaDoMundoFifa.containsKey("França"));

        //Remove a campeão França
        copaDoMundoFifa.remove("França");

        //Retorna se existe ou não um campeão frança
        System.out.println(copaDoMundoFifa.containsKey("França"));

        //Retorna se existe ou não alguma seleção hexa Campeã
        System.out.println(copaDoMundoFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(copaDoMundoFifa.size());
        System.out.println(copaDoMundoFifa);

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer>entry:copaDoMundoFifa.entrySet()){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }
        System.out.println("================");
        //Navega nos registros do mapa
        for (String key:copaDoMundoFifa.keySet()){
            System.out.println(key+"---"+ copaDoMundoFifa.get(key));
        }

        System.out.println(copaDoMundoFifa);

        //Verifica se o mapa contem a chave Estados Unidos
        System.out.println(copaDoMundoFifa.containsKey("Estados Unidos"));

        //Verifica se o mapa contem o valor 5
        System.out.println(copaDoMundoFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpra o mapa
        System.out.println(copaDoMundoFifa.size());

        System.out.println(copaDoMundoFifa.get(3));

        copaDoMundoFifa.clear();

        System.out.println(copaDoMundoFifa.size());
    }
}
