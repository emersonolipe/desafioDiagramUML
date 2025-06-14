public class Main {

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        System.out.println("--- Testando Reprodutor Musical ---");
        meuIphone.tocar();
        meuIphone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIphone.pausar();

        System.out.println("\n--- Testando Aparelho Telefônico ---");
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- Testando Navegador na Internet ---");
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        System.out.println("\n--- Testando Funcionalidades do iPhone ---");
        meuIphone.deslizarParaDesbloquear();
        meuIphone.alternarModoRetratoPaisagem();

        System.out.println("\n--- Verificando Atributos do iPhone ---");
        System.out.println("Sistema Operacional: " + meuIphone.getSistemaOperacional());
        System.out.println("Tamanho da Tela: " + meuIphone.getTamanhoTelaPolegadas() + " polegadas");
        System.out.println("Possui Acelerômetro: " + meuIphone.isPossuiAcelerometro());
    }
}
