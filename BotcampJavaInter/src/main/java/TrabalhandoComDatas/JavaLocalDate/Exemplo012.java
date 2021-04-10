package TrabalhandoComDatas.JavaLocalDate;

import java.time.LocalDate;

public class Exemplo012 {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        //2021-04-06
        System.out.println(ontem);
        //2021-04-05
    }
}
