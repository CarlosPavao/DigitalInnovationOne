package TrabalhandoComDatas.JavaDate;

import java.util.Date;

public class Exemplo003 {
    public static void main(String[] args) {

        Date dataNoPassado = new Date(1617718050326L);
        //Tue Apr 06 11:07:30 BRT 2021

        Date dataNoFuturo = new Date(1617718122692L);
        //Tue Apr 06 11:08:42 BRT 2021

        //Comprando se a dataNoPassado é posterioer a dataNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        System.out.println(isAfter);
        //False

        //Comprando se a dataNoPassado é anterior a dataNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore);
        //true
    }
}
