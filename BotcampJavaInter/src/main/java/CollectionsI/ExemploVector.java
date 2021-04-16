package CollectionsI;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Adiciona 4 esportes no vector
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");

        System.out.println(esportes);

        //Altera o valor da posição 2 do vetor
        esportes.set(2,"Ping Pong");
        System.out.println(esportes);

        //Remove o esporte na posição:2
        esportes.remove(2);
        System.out.println(esportes);

        //Remove o esporte Handebol do vetor
        esportes.remove("Handebol");
        System.out.println(esportes);

        //Retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for (String esporte:esportes){
            System.out.println(esporte);
        }
    }
}
