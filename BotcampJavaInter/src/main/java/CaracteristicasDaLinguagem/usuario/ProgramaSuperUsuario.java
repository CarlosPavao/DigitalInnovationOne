package CaracteristicasDaLinguagem.usuario;

public class ProgramaSuperUsuario {
    public static void main(String[] args) {
        final SuperUsuario user = new SuperUsuario("root","1234");


        user.getLogin();
        user.getSenha();

        String root = user.nome;
    }


}
