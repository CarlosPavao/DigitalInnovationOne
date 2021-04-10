package CaracteristicasDaLinguagem.finals;

public class CasualGamer extends Gamer{

    @Override
    public String keyboard() {
        return super.keyboard();
    }
    /*
    @Override
    public String mouse() {
        return super.keyboard();
    }
     */
    public  String play(final String game){
        return "Jogando: "+game;
    }
}
