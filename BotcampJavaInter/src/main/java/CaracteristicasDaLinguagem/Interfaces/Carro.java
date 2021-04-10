package CaracteristicasDaLinguagem.Interfaces;

public interface Carro extends Automovel{
    String marca();

    double valor();

    default void ligar(){
        System.out.println("Ligando o carro!");
    }

    default String codigoRenavan(){
        return "665643kjdskn";
    }
}
