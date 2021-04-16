package trabalharArrays;

public class exemplo003 {
    public static void main(String[] args) {
        int [][] meuArrayMulti = {{1,2,3,4}, {5,6,7}};

        //percorrendo array multidimesional

        for (int i=0; i < meuArrayMulti.length; i++){
            for (int j=0; j<meuArrayMulti[i].length;j++){
                System.out.println(meuArrayMulti[i][j]);
            }
        }
    }
}
