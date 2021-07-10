package DesenvolvimentoAvançado.InterfacesFuniconal;

import java.util.function.Consumer;

/**
 *
 * @author Carlos Pavão <carlos.henrique93@msn.com>
 */
public class Consumidores {
    public static void main(String[] args) {
        
        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Hello World");
        
    }

}
