package TrabalhandoComDatas.JavaDate;

import java.util.Date;

public class Exemplo004 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1617718050326l);//Tue Apr 06 11:07:30 BRT 2021

        Date dataNoFuturo = new Date(1617718122692L); //Tue Apr 06 11:08:42 BRT 2021

        Date mesmaDataNoFuturo = new Date(1617718122692L); //Tue Apr 06 11:08:42 BRT 2021

        //Comparando se as datas são iguais
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals);
        //true

        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);//passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);// Futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);//datas equivalentes


        System.out.println(compareCase1); // -1

        System.out.println(compareCase2); // 1

        System.out.println(compareCase3); // 0

    }
}
