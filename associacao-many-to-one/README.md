# Associação Many-to-One

Este é um projeto Spring Boot que demonstra uma associação many-to-one entre duas entidades usando JPA, com o banco de dados H2.

## Configuração do Ambiente

Certifique-se de ter o seguinte instalado em sua máquina:

- Java JDK
- Maven

## Configuração do Banco de Dados

O projeto utiliza o banco de dados H2 em memória. Não é necessário configurar nenhum banco de dados adicional.

## Configuração da Aplicação

1. Clone este repositório: `git clone https://github.com/seu-usuario/associacao-many-to-one.git`
2. Navegue até o diretório do projeto: `cd associacao-many-to-one`

## Explicação do Código

### Estrutura do Projeto

O projeto segue uma estrutura padrão do Spring Boot, com os seguintes pacotes principais:

- **com.example.associacaoManyToOne**: Este pacote contém as classes principais da aplicação, incluindo as entidades `Categoria`, `Item`, `Biblioteca`, `Comentario`, `Livro`, `Postagem`, `ToDoList` e `ToDoListItem`, os repositórios `CategoriaRepository` e `ItemRepository`, os controladores `CategoriaController` e `ItemController`, e a classe de aplicação `AssociacaoManyToOneApplication`.

### Funcionalidades Principais

- **Entidades**: As classes de entidade representam as tabelas do banco de dados. Cada entidade possui seus atributos correspondentes, como `id`, `nome`, etc.

- **Repositórios**: As interfaces de repositório estendem `JpaRepository` e fornecem métodos para realizar operações CRUD no banco de dados para as entidades correspondentes.

- **Controladores**: Os controladores definem os endpoints HTTP para interagir com as entidades. Eles injetam os repositórios correspondentes para acessar o banco de dados.

- **Classe de Aplicação**: Esta classe inicializa a aplicação Spring Boot e a executa.

### Configurações

- **Arquivo `application.properties`**: Este arquivo contém as configurações de conexão com o banco de dados H2.

## Testando a Aplicação

Após iniciar a aplicação, você pode usar ferramentas como curl ou Postman para enviar requisições para os endpoints definidos nos controladores. Isso permite interagir com as entidades do banco de dados.

## Execução da Aplicação

Execute o seguinte comando na raiz do projeto para construir e executar a aplicação:

```bash
mvn spring-boot:run
```