package trabalhandoCollections.Map;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Dado os modelos dos carros e seus respectivos consumos na estrada faça:
 * Modelo = Gol - consumo = 14.4 km/l
 * Modelo = Uno - consumo = 15.6 Km/l
 * Modelo = Mobi - consumo = 16.1 Km/l
 * Modelo = hb20 - consumo = 14.5 Km/l
 * Modelo = Kwid - consumo = 15.6 Km/l
 * */
public class ExemploMap {
    public static void main(String[] args) {
        Map CarrosPopulares = new HashMap();//Antes do java 5
        Map<String, Double> CarrosPopulares1 = new HashMap<>();//Generics(jdk 5)
        HashMap<String, Double> CarrosPopulares2= new HashMap<>();
        Map<String, Double> CarrosPopulares2020 = Map.of("Gol", 144.4, "Uno", 15.6, "Mobi",16.1,"Hb20",14.5,"Kwid",15.6);


        System.out.println("--------\tCrie um dicionário que relacione os modelos e seus respectivos consumos\t--------");
        Map<String, Double> Carros = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println("");
        System.out.println(Carros.toString());

        System.out.println("");
        System.out.println("--------\tSubstitua o consumo do Gol por 15,2 Km/l\t--------");
        System.out.println("");

        Carros.put("Gol", 15.2);
        System.out.println(Carros);

        System.out.println("");
        System.out.println("--------\tConfira se determinado modelo está no dicionário\t--------");
        System.out.println("");

        System.out.println("Existe Tucson na lista: "+Carros.containsKey("Tucson"));
        System.out.println("Existe Uno na lista: "+Carros.containsKey("Uno"));

        System.out.println("");
        System.out.println("--------\tExiba o consumo de determinado Carro\t--------");
        System.out.println("");

        System.out.println("O consumo do Uno é : " + Carros.get("Uno")+" Km/L");
        System.out.println("O consumo do HB20 é: " + Carros.get("HB20")+" Km/L");



        System.out.println("");
        System.out.println("--------\tExiba o terceiro modelo adicionado\t--------");
        System.out.println("");

        System.out.println("Não possui uma forma");

        System.out.println("");
        System.out.println("--------\tExiba os modelos\t--------");
        System.out.println("");

        Set<String> modelos = Carros.keySet();
        System.out.println(modelos);


        System.out.println("");
        System.out.println("--------\tExiba os consumos dos carros\t--------");
        System.out.println("");

        Collection<Double> consumos = Carros.values();
        System.out.println(consumos);

        System.out.println("");
        System.out.println("--------\tExiba o modelo mais econômico e seu consumo\t--------");
        System.out.println("");

        Double consumoMaisEficiente = Collections.max(Carros.values());
        Set<Map.Entry<String, Double>> entries = Carros.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry:entries){
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("O modelo mais eficiente é: " +modeloMaisEficiente +" - "+ consumoMaisEficiente);
            }
        }

        System.out.println("");
        System.out.println("--------\tExiba o modelo menos econômico e seu consumo\t--------");
        System.out.println("");

        Double consumoMenosEficiente = Collections.min(Carros.values());
        Set<Map.Entry<String, Double>> entrie = Carros.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry:entrie){
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("O modelo Menos eficiente é: " +modeloMenosEficiente +" - "+ consumoMenosEficiente);
            }
        }


        System.out.println("");
        System.out.println("--------\tExiba a soma dos consumos\t--------");
        System.out.println("");

        Iterator<Double> iterator = Carros.values().iterator();
        Double soma =0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }

        System.out.println(soma);

        System.out.println("");
        System.out.println("--------\tMédia de consumos dos Carros desse Dicionário\t--------");
        System.out.println("");

        Double media = soma/Carros.size();

        System.out.println(media);

        System.out.println("");
        System.out.println("--------\tRemova os carros com determinado consumo\t--------");
        System.out.println("");

        System.out.println(Carros);
        Iterator<Double> iterator1 = Carros.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println("Removendo carros com consumo 15.6 : "+Carros);

        System.out.println("");
        System.out.println("--------\tOrdem informada\t--------");
        System.out.println("");

        Map<String, Double> Carros1 = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(Carros1.toString());

        System.out.println("");
        System.out.println("--------\tOrdenando pela Key\t--------");
        System.out.println("");

        Map<String, Double> Carros2 = new TreeMap<>(Carros1);


        System.out.println(Carros2.toString());

        System.out.println("");
        System.out.println("--------\tApague o Dicionário\t--------");
        System.out.println("");

        Carros.clear();
        System.out.println(Carros);

        System.out.println("");
        System.out.println("--------\tConfira se o dicionário está vazio\t--------");
        System.out.println("");

        boolean taVazio = Carros.isEmpty();
        String status;
        if (taVazio == true){
            status = "Sim";
        }else{
            status = "Não";
        }

        System.out.println("O dicionário está vazio: " +status);






    }
}
