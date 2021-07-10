package DesenvolvimentoAvançado.ParadigmaFuniconal;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[] args) {
        int valor = 20;
        UnaryOperator<Integer> retornandoDobro = v -> v*2;
        System.out.println(retornandoDobro.apply(valor));//Retorna o dobro do valor
        System.out.println(valor);//Valor não será alterado
    }
}
