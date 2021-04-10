package CaracteristicasDaLinguagem.Interfaces;

public class Fiesta implements Carro,Veiculo{


    @Override
    public String marca() {
        return "Ford";
    }

    @Override
    public double valor() {
        return 0;
    }

    @Override
    public String registro() {
        return "123AFG547TR";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();
        Veiculo.super.ligar();

    }
}
