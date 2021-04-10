package CaracteristicasDaLinguagem.pessoa;

import CaracteristicasDaLinguagem.cliente.Cliente;

public class ProgramaDoCLiente {
    public static void main(String[] args) {
        final var cliente = new Cliente(18);

        cliente.getIdade();
        cliente.getPeso();

        System.out.println(cliente.relatorio());

        
    }
}
