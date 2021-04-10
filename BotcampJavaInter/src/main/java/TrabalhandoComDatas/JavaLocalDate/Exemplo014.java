package TrabalhandoComDatas.JavaLocalDate;

import java.time.LocalTime;

public class Exemplo014 {
    public static void main(String[] args) {
        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        //12:52:17.196754900

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        //13:52:17.196754900
    }
}
