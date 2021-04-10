package OrientacaoAObjetos.Parte1.Exercicio;

public class CarroTeste {
    public static void main(String[] args) {
        Carro Uno = new Carro("Uno",5);

        System.out.println("O carro começa com: "+Uno.getQtdePessoas());
        Uno.AdicionarPessoas();
        Uno.AdicionarPessoas();
        System.out.println("O Carro está com:"+ Uno.getQtdePessoas());
        Uno.AdicionarPessoas();
        Uno.RemoverPessoas();
        Uno.RemoverPessoas();
        Uno.RemoverPessoas();
        Uno.RemoverPessoas();
        Uno.RemoverPessoas();
        Uno.RemoverPessoas();
        System.out.println("O Carro está com:"+ Uno.getQtdePessoas());
        Uno.RemoverPessoas();
        Uno.RemoverPessoas();


    }
}
