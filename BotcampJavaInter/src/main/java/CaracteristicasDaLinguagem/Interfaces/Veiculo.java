package CaracteristicasDaLinguagem.Interfaces;



public interface Veiculo {
    String registro();

    default void ligar(){
        System.out.println("Ligando o Veiculo!");
    }
}
