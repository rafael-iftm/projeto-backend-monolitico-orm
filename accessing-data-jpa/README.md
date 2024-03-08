# Spring Data JPA: Acessando Dados com JPA

Este projeto é um exemplo simples de como utilizar o Spring Data JPA para armazenar e recuperar dados em um banco de dados relacional.

## Pré-requisitos

- Cerca de 15 minutos do seu tempo
- Um editor de texto ou IDE favorito
- Java 17 ou posterior
- Maven 3.5+ ou Gradle 7.5+

## Inicialização do Projeto

Você pode inicializar manualmente o projeto seguindo estas etapas:

1. Navegue para [Spring Initializr](https://start.spring.io).
2. Escolha Gradle ou Maven e a linguagem Java.
3. Selecione as dependências Spring Data JPA e H2 Database.
4. Clique em Gerar e baixe o arquivo ZIP resultante.

Alternativamente, você pode usar o projeto pré-inicializado e baixá-lo diretamente do repositório do GitHub ou cloná-lo usando Git.

## Definindo uma Entidade Simples

Neste exemplo, estamos armazenando objetos `Customer` em um banco de dados. A classe `Customer` é uma entidade JPA, conforme definido no pacote `com.example.accessingdatajpa`.

## Criando Consultas Simples

Utilizamos o Spring Data JPA para criar consultas de maneira declarativa. Um exemplo disso é a interface `CustomerRepository`, que estende `CrudRepository` e inclui métodos como `findByLastName()` e `findById()`.

## Criando uma Classe de Aplicativo

A classe `AccessingDataJpaApplication` é a classe principal do aplicativo. Ela possui um método `demo()` que realiza algumas operações básicas de salvamento e busca utilizando o `CustomerRepository`.

## Executando o Aplicativo

Para executar o aplicativo utilizando Maven, siga os passos abaixo:

1. No diretório raiz do seu projeto, execute o seguinte comando no terminal:

    ```bash
    mvn spring-boot:run
    ```

Se preferir, você também pode construir um arquivo JAR executável e executá-lo diretamente. Basta usar os seguintes comandos:

1. No diretório raiz do seu projeto, execute o seguinte comando para construir o arquivo JAR:

    ```bash
    mvn clean package
    ```

2. Em seguida, execute o seguinte comando para iniciar o aplicativo:

    ```bash
    java -jar target/gs-accessing-data-jpa-0.1.0.jar
    ```

## Resumo

Parabéns! Você construiu um aplicativo simples utilizando o Spring Data JPA para persistência de dados em um banco de dados relacional. Este projeto demonstra como criar um aplicativo robusto sem a necessidade de escrever implementações concretas de repositório.

Para mais informações e tutoriais, consulte os recursos adicionais listados no final deste README.

## Recursos Adicionais

- [Acessando Dados JPA com REST](https://spring.io/guides/gs/accessing-data-rest/)
- [Acessando Dados com Gemfire](https://spring.io/guides/gs/accessing-data-gemfire/)
- [Acessando Dados com MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
- [Acessando Dados com MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
- [Acessando Dados com Neo4j](https://spring.io/guides/gs/accessing-data-neo4j/)
  
Se você deseja contribuir para este projeto ou escrever um novo guia, confira nossas diretrizes de contribuição. Este projeto é licenciado sob a licença ASLv2 para o código e uma licença Creative Commons de Atribuição e Sem Derivações para a redação.
