package TrabalhandoComDatas.JavaLocalDate;

import java.time.LocalDateTime;

public class Exemplo015 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        //2021-04-06T12:56:19.913451500

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        //2021-04-08T13:56:31.913451500
    }
}
