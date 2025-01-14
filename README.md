# Desafio de Projeto: Modelagem e Diagramação de um Componente iPhone

Chegou a hora de colocarmos em prática toda a concepção de análise de negócios, requisitos, conceitos da programação orientada a objetos e modelagem UML. Com base no vídeo de lançamento do iPhone conforme link abaixo, elabore em uma ferramenta de UML de sua preferência. A diagramação das classes e interfaces com a proposta de representar os papéis do iPhone de: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Em seguida crie as classes e interfaces no formato de arquivos .java

Pré-requisitos:

* Lógica de programação e POO;

* Conhecimentos básicos(Java);

* Computador com SO de sua preferência(Windows, Linux, Mac OS);

* IDE (Visual Studio Code, Eclipse, etc);

## Desenvolvimento

1.**Criando as Interfaces**

* **Interface `ReprodutorMusical`:**

  Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`

* **Interface `AparelhoTelefonico`:**

  Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`

* **Interface `NavegadorInternet`:**

  Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

2.**Criando a Classe Iphone**: Implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`

3.**Implementando as Interfaces na IDE Intellij**

4.**Implementando a classe na IDE Intellij**

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class AparelhoTelefonico {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class NavegadorInternet {
        +exemploMetodo1()
        +exemploMetodo2(String exemplo)
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```

### Instruções
1. Assista ao vídeo do lançamento do iPhone para entender as funcionalidades principais.
2. Utilize uma ferramenta UML de sua preferência para criar o diagrama das classes e interfaces. Você pode utilizar o modelo acima (criado na sintaxe [Mermaid](https://mermaid.js.org/)), uma alternativa open-source e compatível com arquivos Markdown como este.
3. Opcionalmente, caso esteja cheio(a) de confiança, pode implementar as classes Java representadas em seu diagrama UML.
4. Submeta seu repositório GitHub conforme as orientações da plataforma DIO. Por exemplo:
