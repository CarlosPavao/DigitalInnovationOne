package TrabalhandoComDatas.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo010 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatarData.format(agora);

        System.out.println(dataFormatada);
        //06/04/2021
    }
}
