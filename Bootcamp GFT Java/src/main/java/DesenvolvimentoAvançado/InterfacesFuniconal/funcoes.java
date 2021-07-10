package DesenvolvimentoAvançado.InterfacesFuniconal;

import java.util.function.Function;

public class funcoes {
    public static void main(String[] args) {
        Function<String, String>nomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer>converterStringECalcularODobro = string -> Integer.valueOf(string)*2;

        System.out.println(nomeAoContrario.apply("Carolaine"));
        System.out.println(converterStringECalcularODobro.apply("10"));
    }
}
