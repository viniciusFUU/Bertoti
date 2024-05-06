## Repositório dedicado à materia de Engenharia de Software do 2º semestre do curso de Banco de Dados da FATEC - São José dos Campos.

- 1ª atividade - Resumo sobre o que é Engenharia de software segundo o texto lido em aula, definição de tempo e escala relacionado a tecnologia e definição do significado de tradeoff;
- 2ª atividade - Dar três exemplos de tradeoffs;
- 3ª atividade - Definições dos tipos de arquitetura de software; 
- 4ª atividade - Definição de arquitetura;
- 5ª atividade - Desenvolver um software;
- 6ª atividade - Código JAVA;
- 7ª atividade - testes atuomatizados.

## Atividade 1 - Resumo sobre o que é Engenharia de software

Withain Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software : engineering after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomesnsion to programming. Cubes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, mmimaintenance). The addition of time adds an important new dimeension to programming.

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

### comentários

- engenharia de software - programação + tempo, escala e tradeoff.

- tempo - software e código tem grandes chances da - estrutura piorar ao longo do tempo, o que pode levar o software a ficar inutilizado.

- escala - possibilidade de expandir o software, otimizar.

- tradeoff - jogo de perde ganha. 

## Atividade 2 - Dar três exemplos de tradeoffs

1º Utilizar python para agilizar no processo de desenvolver sistemas em relação ao JAVA. Mas perder velocidade de processamento de máquina;

2º Utilizar MongoDB para facilitar a parte de código para armazenamento de dados em relação ao sgbd da Oracle. Porém, tem uma escalonabilidade menor que o segundo banco de dados mencionado;

3º Utilizar linux para ter uma segurança maior em relação ao windowns. Porém, tem uma interface menos visual que a do sistema da microsoft. 

## Atividade 3 - Definições dos tipos de arquitetura de software

### ---------- Arquitetura de Camadas ----------

Este padrão é amplamente utilizado em desenvolvimento de software para criar sistemas modulares, escaláveis e e de fácil manutenção. 

Ela tem uma simplicidade muito grande, o que torna ela mais barata de ser desenvolvida. Porém, por estar tudo n mesmo lugar, faz com que ela tenha uma escalabilidade pequena, o que dificulta o crescimento do sistema.

### ---------- Arquitetura pipeline ----------

É uma arquitetura utlizada mas em processamento de dados e computação paralela, onde a velocidade do processamento é crucial.

Ela, assim como a arquitetura de camadas, é simples, o que a torna barata. Não escala muito bem por fazer uma atividade de cada vez.

### ---------- Arquitetura microkernel ----------

Utilizado em sistemas operacionais, onde vc tem o núcleo e os plugins, que são as interfaces.

### ---------- Arquitetura baseada em serviços ----------

É um modelo de desenvolvimento de software que cisa criar sistemas distribuídos e capazes de trabalhar com outros sistemas. Ao contrário da simplicidade das arquiteturas de camadas e pipeline, ela oferece uma abordagem mais escalável e flexível.

### ---------- Arquitetura Orientada a Eventos ----------

É um modelo que foca na comunicação entra os componentes do software por meio de eventos. Ao contrário das arquiteturas de camadas e pipeline, a arquitetura orientada a eventos permite que os componentes reajam a eventos assíncronos, o que torna maior a flexibilidade e a escalabilidade.

### ---------- Arquitetura de Microsserviços ----------

É um modelode software que organiza um sistema como um conjunto de serviços independente e autonomos, cada um focado em realizar uma função em especifica. Comparando a arquitetura baseada em serviços, os microsserviços são ainda mais detalhados, visando a modularidade extrema.

## Atividade 4 - Arquitetura de Software selecionada

Optei por desenvolver o sistema com a arquitetura em camadas. Por ter uma composição mais simples, faz sentido um pequeno sistema ser projetado em tal formato. Além de facilitar a reutilização de código e futuramente, escalabilidade do sistema.

![alt text](./engenharia%20de%20software/img/image.png)
