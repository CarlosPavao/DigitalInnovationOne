package OrientacaoAObjetos.Parte1.Exercicio;

public class Carro {
    private int QtdePessoas;
    private String Modelo;

    Carro(String Modelo,int QtdePessoas){
        this.QtdePessoas = QtdePessoas;
    }

    public void AdicionarPessoas(){
        if (QtdePessoas < 7){
            QtdePessoas ++;
        }else{
            System.out.println("Não é possivel, o carro está lotado");
        }

    }

    public void RemoverPessoas(){
        if (QtdePessoas > 0 ){
            QtdePessoas --;
        }else{
            System.out.println("Não é possivel, não tem mais pessoas no carro");
        }


    }

    public int getQtdePessoas() {
        return QtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        QtdePessoas = qtdePessoas;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }
}
