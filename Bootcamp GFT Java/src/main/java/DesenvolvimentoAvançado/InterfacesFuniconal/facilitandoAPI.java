package DesenvolvimentoAvançado.InterfacesFuniconal;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class facilitandoAPI {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a+b;
        Calculo subtracao = (a,b) -> a-b;
        Calculo divisao = (a,b) -> a/b;
        Calculo multiplicacao  = (a,b) -> a*b;
        
        System.out.println(executarOperacao(soma, 1, 3));
        System.out.println(executarOperacao(subtracao, 4, 3));
        System.out.println(executarOperacao(divisao, 9, 3));
        System.out.println(executarOperacao(multiplicacao, 25, 3));
        
    }
    
   public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calcular(a,b);        
    } 
}


interface Calculo{
    public int calcular(int a,int b);
}
