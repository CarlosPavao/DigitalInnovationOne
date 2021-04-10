package OrientacaoAObjetos.parte3.Exercicio;

public class Programa {
    public static void main(String[] args) {
        Funcionarios atendente = new Atendente();
        atendente.setImposto(1200.00);
        System.out.println(atendente.calculaImposto());

        Funcionarios supervisor = new supervisor();
        supervisor.setImposto(2200.00);
        System.out.println(supervisor.calculaImposto());


        Gerente gerente = new Gerente();
        gerente.setImposto(5200.00);
        System.out.println(gerente.calculaImposto());
    }

}
