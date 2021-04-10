package OrientacaoAObjetos.parte3.Exercicio;

public class supervisor extends Funcionarios{
    @Override
    public double calculaImposto() {
        return this.getImposto() * 0.07;

    }
}
