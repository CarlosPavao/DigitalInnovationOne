package DesenvolvimentoAvançado.AssincronoEParalelo;



public class ThreadExemplos {
    public static void main(String[] args) {
        GeradorPDF iniciarGeradorPdf = new GeradorPDF();
        BarradeCarregamento BarraCarregamento = new BarradeCarregamento(iniciarGeradorPdf);

        iniciarGeradorPdf.start();
        BarraCarregamento.start();



    }
}

class GeradorPDF extends Thread{

    @Override
    public void run() {
        try {
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("PDF gerado com sucesso");

    }
}
class BarradeCarregamento extends Thread{
    private Thread iniciarGeradorPdf;

    public BarradeCarregamento(Thread iniciarGeradorPdf){
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run() {
        while (true){
            try {

                Thread.sleep(500);

                if (!iniciarGeradorPdf.isAlive()){
                    break;
                }
                System.out.println("Loading...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


