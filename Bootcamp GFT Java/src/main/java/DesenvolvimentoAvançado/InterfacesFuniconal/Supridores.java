package DesenvolvimentoAvançado.InterfacesFuniconal;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {
        Supplier<Pessoa> instaciarPessoa = () -> new Pessoa();

        System.out.println(instaciarPessoa.get());
    }
}
class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Carlos";
        idade = 27;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - idade: %d.",nome,idade);
    }
}
