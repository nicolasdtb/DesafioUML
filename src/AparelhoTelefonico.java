import java.util.concurrent.ThreadLocalRandom;

public class AparelhoTelefonico {
     
    public boolean ligar(String numero){
        System.out.println("Realizando ligação...\nChamando número: " + numero);
        if (!atendeu()){
            System.out.println("Ligação recusada.");
            return false;
        }else{
            System.out.println("Ligação atendida.");
            return true;
        }
    }
    
    public void atender(){
        System.out.println("Atendendo chamada...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    public void desligar(){
        System.out.println("Ligação finalizada.");
    }

    private boolean atendeu(){
        int temp = ThreadLocalRandom.current().nextInt(1, 3);

        if (temp == 2){
            return true;
        }else{
            return false;
        }
    }

}
