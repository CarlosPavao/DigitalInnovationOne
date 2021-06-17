package trabalhandoCollections.List.Exercicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
*Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista;
* Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas
* acima desta média, e em que mês elas ocorreram(mostrar por extenso 1 - Janeiro, 2 - Fevereiro e etc).
* */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        List<Double> temperatura =new ArrayList<>();
        double temp =0, soma=0d;

        for(int i=0; i< 6; i++){
            switch (i){
                case 0:
                    System.out.println("Digite a Temperatura Janeiro:");
                    temp=entrada.nextDouble();
                    temperatura.add(temp);
                    break;
                case 1:
                    System.out.println("Digite a Temperatura Fevereiro:");
                    temp=entrada.nextDouble();
                    temperatura.add(temp);
                    break;
                case 2:
                    System.out.println("Digite a Temperatura Março:");
                    temp=entrada.nextDouble();
                    temperatura.add(temp);
                    break;
                case 3:
                    System.out.println("Digite a Temperatura Abril:");
                    temp=entrada.nextDouble();
                    temperatura.add(temp);
                    break;
                case 4:
                    System.out.println("Digite a Temperatura Maio:");
                    temp=entrada.nextDouble();
                    temperatura.add(temp);
                    break;
                case 5:
                    System.out.println("Digite a Temperatura Junho:");
                    temp=entrada.nextDouble();
                    temperatura.add(temp);
                    break;
            }
        }
        Iterator<Double> iterator = temperatura.iterator();
        while (iterator.hasNext()){
            temp = iterator.next();
            soma += temp;
        }
        System.out.println("Temperaturas Semestral: " +temperatura);
        //Media semestral

        double media = soma / temperatura.size();
        System.out.printf("Média temperaturas Semestral:  %.2fº.\n",media);
        System.out.println("----------");

        //temperaturas acima da média
        for (Double temperaturas: temperatura){
            if (temperaturas>media){
                int posicao = temperatura.indexOf(temperaturas);
                switch (posicao) {
                    case 0:
                        System.out.println((posicao + 1) + " - JANEIRO: " + temperaturas + " oC");
                        break;
                    case 1:
                        System.out.println((posicao + 1) + " - FEVEREIRO: " + temperaturas + " oC");
                        break;
                    case 2:
                        System.out.println((posicao + 1) + " - MARÇO: " + temperaturas + " oC");
                        break;
                    case 3:
                        System.out.println((posicao + 1) + " - ABRIL: " + temperaturas + " oC");
                        break;
                    case 4:
                        System.out.println((posicao + 1) + " - MAIO: " + temperaturas + " oC");
                        break;
                    case 5:
                        System.out.println((posicao + 1) + " - JUNHO: " + temperaturas + " oC");
                        break;
                    default:
                        break;
                }

            }

        }
/*
        int i =0;
        Iterator<Double> iterator1 = temperatura.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() > media){
                switch (i){
                    case 0:
                        System.out.println("1-Janeiro");
                        break;
                    case 1:
                        System.out.println("2-Fevereiro");
                        break;
                    case 2:
                        System.out.println("3-Março:");
                        break;
                    case 3:
                        System.out.println("4-Abril:");
                        break;
                    case 4:
                        System.out.println("5-Maio:");
                        break;
                    case 5:
                        System.out.println("6-Junho:");
                        break;
                }
            }
            i++;
        }
*/
    }
}
