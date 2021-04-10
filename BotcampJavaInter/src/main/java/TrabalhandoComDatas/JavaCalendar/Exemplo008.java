package TrabalhandoComDatas.JavaCalendar;

import java.util.Calendar;

public class Exemplo008 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n",agora);
        //ter. abr. 06 11:40:27 BRT 2021

        System.out.printf("%tF\n",agora);
        //2021-04-06

        System.out.printf("%tD\n",agora);
        //04/06/21

        System.out.printf("%tr\n",agora);
        //11:40:27 AM

        System.out.printf("%tT\n",agora);
        //11:40:27
    }
}
