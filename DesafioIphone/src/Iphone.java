public class Iphone {
    public static void main(String[] args) {
        String cor = "Branco";
        String modelo = "Iphone 15";
        int ano = 2024;
        //Informações sobre o modelo do aparelho,cor e ano;
        System.out.println("\n \n O seu aparelho telefonico é um " + modelo + " " + cor + " do ano de " + ano);

        //utilizando todos os metodos da classe ReprodutorMusical onde é possivel selecionar uma musica, tocar ou pausar ela;
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica("Michael Jackson");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar(); 

        //utilizando todos os metodos da classe AparelhoTelefonico onde é possivel ligar para um numero, iniciar correio de voz ou atender;
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar("(11)91827-1950");  
        aparelhoTelefonico.iniciarCorreioVoz();                    
        aparelhoTelefonico.atender();

         //utilizando todos os metodos da classe NavegadorInternet onde é possivel Exibir uma pagina, adicionar uma nova aba e atualizar a pagina;
         NavegadorInternet navegadorInternet = new NavegadorInternet();
         navegadorInternet.exibirPagina("https://www.youtube.com");
         navegadorInternet.adicionarNovaAba();
         navegadorInternet.atualizarPagina();



    }
}
