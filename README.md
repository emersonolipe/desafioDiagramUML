# [DIO](www.dio.me) - Trilha Java Básico

## POO - Desafio DIAGRAMA UML

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, fui responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        -String sistemaOperacional = "iOS (baseado em OS X)"
        -String tipoTela = "Multi-touch Widescreen"
        -double tamanhoTelaPolegadas = 3.5
        -int resolucaoTelaPPI = 160
        -boolean possuiBotaoHome
        -double espessuraMM = 11.6
        -int cameraMegapixels = 2
        -boolean possuiHeadsetJack
        -boolean possuiSlotSIM
        -boolean possuiBotaoSleepWake
        -boolean possuiAltoFalante
        -boolean possuiMicrofone
        -boolean possuiConectoriPod
        -boolean possuiSensorProximidade
        -boolean possuiSensorLuzAmbiente
        -boolean possuiAcelerometro
        +deslizarParaDesbloquear()
        +alternarModoRetratoPaisagem()
    }

    iPhone "1" --> "1" ReprodutorMusical : utiliza
    iPhone "1" --> "1" AparelhoTelefonico : utiliza
    iPhone "1" --> "1" NavegadorInternet : utiliza
```
