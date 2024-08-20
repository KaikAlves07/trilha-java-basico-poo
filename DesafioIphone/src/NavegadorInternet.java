public class NavegadorInternet extends Iphone {
    String url;

    public void exibirPagina(String url){
        this.url = url;
        System.out.println("Exibindo a página: "+url);
    };

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba!");        
    };

    public void atualizarPagina(){
        System.out.println("Atualizando a página!");        
    };
}
