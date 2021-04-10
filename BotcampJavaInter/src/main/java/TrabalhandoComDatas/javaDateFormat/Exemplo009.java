package TrabalhandoComDatas.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

import static java.text.DateFormat.*;

public class Exemplo009 {
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = getInstance().format(agora);
        System.out.println(dateToStr);
        //06/04/2021 12:34

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, SHORT).format(agora);
        System.out.println(dateToStr);
        //6 de abril de 2021 12:34

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, LONG).format(agora);
        System.out.println(dateToStr);
        //6 de abril de 2021 12:35:22 BRT
    }
}
