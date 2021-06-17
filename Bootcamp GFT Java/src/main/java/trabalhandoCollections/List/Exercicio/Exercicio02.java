package trabalhandoCollections.List.Exercicio;

import java.util.*;


/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre o crime. As perguntas são:
 * 1-Telefonou para Vítima?
 * 2-Esteve no local do crime?
 * 3-Mora perto da Vítima/
 * 4-Devia para Vitima?
 * 5-Já trabalhou com a vítima?
 *
 * Se responder positivamente a 2 questões ela deve ser classificada como suspeita,
 * entre 3 e 4 como Cumplice" e 5 como Assasina. Caso contrario ela será classificada como Inocente
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();
        String resposta;
        int sim = 0;

        System.out.println("---Perguntas---");
        System.out.println("Telefonou para Vítima?");
        resposta = entrada.next();
        respostas.add(resposta);
        System.out.println("Esteve no local do crime?");
        resposta = entrada.next();
        respostas.add(resposta);
        System.out.println("Mora perto da Vítima?");
        resposta = entrada.next();
        respostas.add(resposta);
        System.out.println("Devia para Vitima?");
        resposta = entrada.next();
        respostas.add(resposta);
        System.out.println("Já trabalhou com a vítima?");
        resposta = entrada.next();
        respostas.add(resposta);

        for(String resp : respostas){
            if (resp.equalsIgnoreCase("sim")) {
                sim++;
            }
        }
        /*
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                sim ++;
            }
        }
        */
        switch(sim) {
            case 2:
                System.out.println(">> SUSPEITA <<");
                break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<");
                break;
            case 5:
                System.out.println(">> ASSASSINO <<");
                break;
            default:
                System.out.println(">> INOCENTE <<");
                break;
        }
    }
}
