package CaracteristicasDaLinguagem.pessoa;

public class Pessoa {

    private Integer idade;
    private float peso;

    public Pessoa(){

    }
    public  Pessoa(final Integer idade){
        this.idade=idade;
    }
    public Pessoa(final Integer idade, final Float peso){
        this.idade=idade;
        this.peso=peso;
    }

    public Integer getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }
    protected String relatorio(){
        return "idade:" + idade + " e Peso:" + peso+".";
    }
}
