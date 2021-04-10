package OrientacaoAObjetos.parte3.Exercicio;

public class Funcionarios {

    private String nome;
    private String dataContratação;
    private double imposto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataContratação() {
        return dataContratação;
    }

    public void setDataContratação(String dataContratação) {
        this.dataContratação = dataContratação;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calculaImposto() {

        return this.imposto * 0.01;
    }
}
