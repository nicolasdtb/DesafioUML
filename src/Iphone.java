public class Iphone {
    public static void main(String[] args){
        
        //Inicialização dos objetos utilizados
        ReprodutorMusical rpm = new ReprodutorMusical();    
        AparelhoTelefonico apt = new AparelhoTelefonico();
        NavegadorInternet nav = new NavegadorInternet();

        //Prints e objetos auxiliares para imersividade da aplicação.
        String contato = "Joao Freitas";

        System.out.println("iPhone iniciado.");

        
        
        //Utilização da classe ReprodutorMusical
        System.out.println("Abrindo reprodutor musical...");
        rpm.selecionarMusica("Franz Ferdinand - Take Me Out");
        rpm.pausar();
        rpm.tocar();
        rpm.selecionarMusica("Amy Winehouse - Back to Black");

        //Utilização da classe AparelhoTelefônico
        System.out.println("Abrindo telefone...");
        apt.iniciarCorreioVoz();
        boolean temp = apt.ligar("51998877665");
        if (temp){
            apt.desligar();
        }
        System.out.println("Chamada recebida de: '" + contato + "'");
        apt.atender();
        apt.desligar();

        //Utilização da classe NavegadorInternet
        System.out.println("Abrindo Navegador de Internet...");
        nav.exibirPagina("https://google.com/");
        nav.atualizarPagina();
        nav.adicionarNovaAba();
        nav.exibirPagina("https://web.dio.me/");
    }
}
