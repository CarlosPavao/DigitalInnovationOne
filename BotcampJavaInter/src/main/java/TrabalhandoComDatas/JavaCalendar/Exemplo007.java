package TrabalhandoComDatas.JavaCalendar;

import java.util.Calendar;

public class Exemplo007 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: "+agora.getTime());
        //A data corrente é: Tue Apr 06 11:29:41 BRT 2021


        agora.add(Calendar.DATE, 9);
        System.out.println("15 dias atrás: "+agora.getTime());
        //15 dias atrás: Mon Mar 22 11:29:41 BRT 2021

        agora.add(Calendar.MONTH, 6);
        System.out.println("4 meses despois: "+agora.getTime());
        //4 meses despois: Thu Jul 22 11:31:14 BRT 2021

        agora.add(Calendar.YEAR,-28);
        System.out.println("2 anos Depois: "+agora.getTime());
        //2 anos Depois: Sat Jul 22 11:32:06 BRT 2023


    }
}
