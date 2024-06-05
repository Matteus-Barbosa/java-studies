package Studies.MiniProjetos.iPhone;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funcionalidades de reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Testando funcionalidades de aparelho telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades de navegador de internet
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
