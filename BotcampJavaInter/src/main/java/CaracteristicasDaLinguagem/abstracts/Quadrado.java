package CaracteristicasDaLinguagem.abstracts;

public class Quadrado extends FormaGeometrica {
    private  String nome;
    private Double area;

    public Quadrado(final String nome, final Double area){
        this.nome=nome;
        this.area=area;
    }

    @Override
    public String nome() {
        return null;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "nome='" + nome + '\'' +
                ", area=" + area +
                '}';
    }
}
