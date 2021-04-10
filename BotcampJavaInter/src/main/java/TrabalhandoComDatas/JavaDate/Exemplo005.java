package TrabalhandoComDatas.JavaDate;

import java.time.Instant;
import java.util.Date;

public class Exemplo005 {
    public static void main(String[] args) {
        Date dataInicio = new Date(1617718050326l);
        System.out.println(dataInicio);

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
    }
}
