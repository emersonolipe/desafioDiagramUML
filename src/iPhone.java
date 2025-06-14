
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String sistemaOperacional = "iOS (baseado em OS X)";
    private String tipoTela = "Multi-touch Widescreen";
    private double tamanhoTelaPolegadas = 3.5;
    private int resolucaoTelaPPI = 160;
    private boolean possuiBotaoHome = true;
    private double espessuraMM = 11.6;
    private int cameraMegapixels = 2;
    private boolean possuiHeadsetJack = true;
    private boolean possuiSlotSIM = true;
    private boolean possuiBotaoSleepWake = true;
    private boolean possuiAltoFalante = true;
    private boolean possuiMicrofone = true;
    private boolean possuiConectoriPod = true;
    private boolean possuiSensorProximidade = true;
    private boolean possuiSensorLuzAmbiente = true;
    private boolean possuiAcelerometro = true;

    // Métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Métodos específicos do iPhone
    public void deslizarParaDesbloquear() {
        System.out.println("Deslizando para desbloquear o iPhone.");
    }

    public void alternarModoRetratoPaisagem() {
        System.out.println("Alternando modo retrato/paisagem.");
    }

    // Getters para os atributos (opcional, mas boa prática)
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public double getTamanhoTelaPolegadas() {
        return tamanhoTelaPolegadas;
    }

    public int getResolucaoTelaPPI() {
        return resolucaoTelaPPI;
    }

    public boolean isPossuiBotaoHome() {
        return possuiBotaoHome;
    }

    public double getEspessuraMM() {
        return espessuraMM;
    }

    public int getCameraMegapixels() {
        return cameraMegapixels;
    }

    public boolean isPossuiHeadsetJack() {
        return possuiHeadsetJack;
    }

    public boolean isPossuiSlotSIM() {
        return possuiSlotSIM;
    }

    public boolean isPossuiBotaoSleepWake() {
        return possuiBotaoSleepWake;
    }

    public boolean isPossuiAltoFalante() {
        return possuiAltoFalante;
    }

    public boolean isPossuiMicrofone() {
        return possuiMicrofone;
    }

    public boolean isPossuiConectoriPod() {
        return possuiConectoriPod;
    }

    public boolean isPossuiSensorProximidade() {
        return possuiSensorProximidade;
    }

    public boolean isPossuiSensorLuzAmbiente() {
        return possuiSensorLuzAmbiente;
    }

    public boolean isPossuiAcelerometro() {
        return possuiAcelerometro;
    }
}

