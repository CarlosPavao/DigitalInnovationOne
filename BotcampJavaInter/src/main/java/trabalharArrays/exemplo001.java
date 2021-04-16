package trabalharArrays;

public class exemplo001 {
    public static void main(String[] args) {
        int [] meuArray = new int[7];

        int [] meuArray2 = {12,32,54,6,8,89,64};

        System.out.println(meuArray[1]);
        System.out.println(meuArray2[3]);

        //Alterando valor de um elemento
        meuArray2[2] = 10;

        System.out.println(meuArray2[2]);

        //comprimento do array
        System.out.println(meuArray.length);
    }
}
