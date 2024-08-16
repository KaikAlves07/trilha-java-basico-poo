# trilha-java-basico-poo
Repositório criado com o intuito de modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

```mermaid
classDiagram

Iphone --|> ReprodutorMusical
ReprodutorMusical : +tocar() \n +pausar() \n +selecionarMusica(String musica)
ReprodutorMusical : +String musica
```
