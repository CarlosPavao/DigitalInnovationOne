package TrabalhandoComDatas.JavaDate;

import java.util.Date;

public class Exemplo002 {
    public static void main(String[] args) {
        Long miliSegundoAtual = System.currentTimeMillis();

        System.out.println(miliSegundoAtual);

        Date novaData = new Date(miliSegundoAtual);

        System.out.println(novaData);

    }
}
