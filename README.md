# Repositório de Exercícios – Padrões de Projeto
**Membros:** Diego Cordeiro Pedrosa, Marcos Vinicius Nascimento Souza

Este repositório tem como objetivo **implementar e demonstrar o uso de padrões de projeto GoF** por meio de dois problemas práticos e independentes: **Facade** e **Flyweight**. Os exercícios foram pensados para reforçar conceitos de **baixo acoplamento**, **encapsulamento de complexidade** e **uso eficiente de memória**.

---

## 📌 Problema 1 – Padrão **Facade** (Viagem Espacial)

### Contexto

Uma **Estação de Controle** precisa iniciar a viagem de um astronauta para um determinado **corpo celeste de destino**. Entretanto, a estação **não deve conhecer nem controlar os detalhes internos** da preparação e da partida.

O processo envolve diversas etapas, como:

* vestir a roupa espacial adequada;
* entrar em uma nave específica;
* partir de um corpo celeste de origem para outro de destino.

Ao final, a estação deve receber um **relatório textual coerente** descrevendo a partida, por exemplo:

> "O astronauta de nome X vestiu a roupa espacial, entrou na nave de nome Y e partiu da origem A para o destino B".

### Estrutura do Sistema

O pacote responsável pela viagem espacial é composto pelas seguintes classes:

* **Astronauta**
* **RoupaEspacial** (e suas subclasses)
* **Nave**
* **CorpoCeleste** (e suas subclasses)

O astronauta sempre sabe **em qual corpo celeste está no momento**.

### Solução com Facade

A **Estação de Controle (Cliente)** interage apenas com uma **fachada simples**, que abstrai toda a complexidade do subsistema. Para iniciar a viagem, a estação apenas informa:

* o **nome do astronauta**;
* o **corpo celeste de destino**.

A fachada coordena internamente todas as ações necessárias e retorna a mensagem final da partida.

📐 **Objetivo do padrão**: simplificar o uso de um subsistema complexo, reduzindo o acoplamento entre cliente e implementação.

---

## 📌 Problema 2 – Padrão **Flyweight** (Venda de Ingressos)

### Contexto

Uma agência realiza a venda de ingressos para um **grande evento**, com a expectativa de **centenas de milhares de compradores**.

Cada ingresso possui:

* nome do evento;
* local;
* data;
* **cor** (ouro, prata ou bronze – define benefícios);
* **identificação única do comprador**.

O sistema precisa ser **altamente eficiente em termos de memória**, mesmo com um volume muito grande de bilhetes.

### Desafio

Criar um serviço de venda e gerenciamento de ingressos que:

* minimize a criação desnecessária de objetos;
* compartilhe informações comuns entre os ingressos;
* diferencie apenas os dados exclusivos de cada comprador.

### Solução com Flyweight

O padrão **Flyweight** é utilizado para separar:

* **Estado intrínseco (compartilhado)**: dados iguais para muitos ingressos (evento, local, data e cor);
* **Estado extrínseco (não compartilhado)**: identificação única do comprador.

Ingressos com a mesma cor e dados do evento reutilizam o mesmo objeto Flyweight.

Ao final da simulação, o sistema deve:

* realizar a venda de **100 mil ingressos**;
* garantir a existência de ingressos das três cores (ouro, prata e bronze);
* **informar quantos objetos realmente foram criados em memória**.

📐 **Objetivo do padrão**: reduzir drasticamente o uso de memória através do compartilhamento de objetos imutáveis.

---

## 🎯 Objetivo Geral do Repositório

* Praticar a aplicação de **padrões de projeto estruturais**;
* Entender quando e por que utilizar **Facade** e **Flyweight**;
* Demonstrar boas práticas de design orientado a objetos;
* Facilitar o estudo e a avaliação acadêmica dos conceitos.

---

## 🛠️ Observações

* Cada problema é independente e pode ser executado separadamente.
* O foco está na **estrutura do projeto e no uso correto dos padrões**, não em interfaces gráficas.
* O código foi escrito de forma didática, priorizando clareza e organização.

---

📚 **Padrões abordados**: Facade, Flyweight (GoF)
