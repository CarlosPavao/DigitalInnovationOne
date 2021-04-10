package CaracteristicasDaLinguagem.pessoa;

public class ProgramaPessoaFisica {
    public static void main(String[] args) {
        final PessoaFisica pessoa = new PessoaFisica(33,120.2f);

        System.out.println(pessoa.relatorio());
    }
}
