# Modelagem e Diagramação de um iPhone
____
Com base no vídeo de lançamento do [iPhone de 2007](https://youtu.be/9ou608QQRq8?feature=shared), foi elaborado a diagramação e representação UML do componente iPhone, abrangendo suas funcionalidades como _Reprodutor Musical_, _Aparelho Telefônico_ e _Navegador na Internet_. Utilizando a ferrementa OpenSource [Mermaid](https://mermaid.js.org) UML.
Em seguida, implementadas em classes e interfaces no formato de arquivos ```.java```.

### Assuntos Exercitados

- Analise de requisitos;
- Uso de UML (linguagem de modelagem unificada);
- Programação Orientada a Objetos;
- Interfaces em Java.

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
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet

```
