package CaracteristicasDaLinguagem.Interfaces;

public class Gol implements Carro{

    @Override
    public String marca() {
        return "Volswagen";
    }

    @Override
    public double valor() {
        return 12.000;
    }
}
