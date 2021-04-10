package OrientacaoAObjetos.Parte2.Exercício;

import org.springframework.boot.Banner;

public class Carro {
    private String Marca;
    private String Modelo;
    private String Variante;
    private int Ano;

    Carro(String Marca, String Modelo, int Ano){
        this.Ano = Ano;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getVariante() {
        return Variante;
    }

    public void setVariante(String variante) {
        Variante = variante;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Variante='" + Variante + '\'' +
                ", Ano=" + Ano +
                '}';
    }
}
