public class AparelhoTelefonico extends Iphone {
    String numero;

   public void ligar(String numero){
    this.numero = numero;
    System.out.println("Ligando para o numero: "+numero);
   };
   public void atender(){
    System.out.println("Atendendo o telefone!");
   };
   public void iniciarCorreioVoz(){
    System.out.println("Iniciando correio de voz, deixe sua mensagem: ");
   };
}
