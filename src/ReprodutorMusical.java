
public class ReprodutorMusical{
    public void tocar(){
        System.out.println("Reproduzindo música...");
    }   
    
    public void pausar(){
        System.out.println("Música pausada...");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada.\nTocando agora: '" + musica + "'.");
    }
}