package OrientacaoAObjetos.parte3.encapsulamento;

public class exemplo001 {
    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Carlos Pavão", 15, 10, 1993);

        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Carlos Henrique Pavão Inacio");

        System.out.println(eu.getNome());

    }
}
