public class ReprodutorMusical extends Iphone{
    String musica;

    public void selecionarMusica(String musica){
         this.musica = musica;
    };

    public void tocar(){
        System.out.println("Iniciando reprodução da musica selecionada, tocando: "+musica);
    };

    public void pausar(){
        System.out.println("Pausando musica que esta tocando no momento");
    };

    
      

}
