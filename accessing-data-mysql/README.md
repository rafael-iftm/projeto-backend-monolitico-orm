# Aplicação Spring com MySQL

Esta é uma aplicação Spring simples que demonstra como conectar e interagir com um banco de dados MySQL usando Spring Data JPA e Maven.

## Configuração do Ambiente

Certifique-se de ter o seguinte instalado em sua máquina:

- Java JDK
- Maven
- MySQL Server

## Configuração do Banco de Dados

1. Inicie o MySQL Server.
2. Crie um banco de dados chamado `db_example`.
3. Crie um usuário com permissões no banco de dados `db_example`.

## Configuração da Aplicação

1. Clone este repositório: `git clone https://github.com/seu-usuario/sua-aplicacao.git`
2. Navegue até o diretório do projeto: `cd sua-aplicacao`
3. Abra o arquivo `src/main/resources/application.properties` e configure as informações de conexão com o banco de dados MySQL.

## Explicação do Código

### Estrutura do Projeto

O projeto segue uma estrutura padrão do Spring Boot, com os seguintes pacotes principais:

- **com.example.accessingdatamysql**: Este pacote contém as classes principais da aplicação, incluindo a entidade `User`, o repositório `UserRepository`, o controlador `MainController` e a classe de aplicação `AccessingDataMysqlApplication`.

### Funcionalidades Principais

- **Entidade `User`**: A classe `User` representa a entidade que será mapeada para uma tabela no banco de dados. Ela possui os campos `id`, `name` e `email`.

- **Repositório `UserRepository`**: Esta interface estende `CrudRepository` e fornece métodos para realizar operações CRUD no banco de dados para a entidade `User`.

- **Controlador `MainController`**: Este controlador define os endpoints HTTP para adicionar um novo usuário (`/demo/add`) e obter todos os usuários (`/demo/all`). Ele injeta o `UserRepository` para interagir com o banco de dados.

- **Classe de Aplicação `AccessingDataMysqlApplication`**: Esta classe inicializa a aplicação Spring Boot e a executa.

### Configurações

- **Arquivo `application.properties`**: Este arquivo contém as configurações de conexão com o banco de dados MySQL, como URL, nome de usuário e senha.

### Testando a Aplicação

Após iniciar a aplicação, você pode usar ferramentas como curl ou Postman para enviar requisições para os endpoints definidos no controlador `MainController`. Isso permite adicionar novos usuários e recuperar todos os usuários do banco de dados.

- **POST /demo/add**: Adiciona um novo usuário ao banco de dados.
- **GET /demo/all**: Retorna todos os usuários do banco de dados.

Você pode usar ferramentas como curl ou Postman para enviar requisições para esses endpoints.


## Execução da Aplicação

Execute o seguinte comando na raiz do projeto para construir e executar a aplicação:

```bash
mvn spring-boot:run
```