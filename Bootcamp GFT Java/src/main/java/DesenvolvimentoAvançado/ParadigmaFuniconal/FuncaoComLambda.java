package DesenvolvimentoAvançado.ParadigmaFuniconal;

public class FuncaoComLambda {
    public static void main(String[] args) {
        Funcao colocarPrefixo = valor ->"Sr. "+valor;
        System.out.println(colocarPrefixo.gerar("João"));
    }
}
