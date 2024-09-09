# Sistema de Vendas API

Este projeto é uma API REST para gerenciar vendas, implementada com Spring Boot. A API permite buscar vendas com e sem desconto, vendas ordenadas por valor unitário, produtos mais vendidos em uma Nota Fiscal específica, e mais. Além disso, a API está documentada utilizando o Swagger/OpenAPI.

## Funcionalidades

- **Busca de vendas sem desconto:** Retorna todas as vendas que foram realizadas sem qualquer desconto.
- **Busca de vendas com desconto:** Retorna todas as vendas que foram realizadas com algum desconto.
- **Vendas ordenadas por valor unitário:** Retorna todas as vendas ordenadas do maior para o menor valor unitário.
- **Produto mais vendido em uma Nota Fiscal (NF):** Retorna o código do produto mais vendido em uma NF específica.
- **NFs com mais de dez unidades vendidas:** Retorna as Notas Fiscais em que mais de dez unidades de pelo menos um produto foram vendidas.
- **NFs com valor total maior que 500:** Retorna as Notas Fiscais com valor total maior que 500, ordenadas do maior para o menor valor.

## Estrutura do Projeto

```bash
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂example
 ┃ ┃ ┃ ┃ ┗ 📂swagger
 ┃ ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜OpenApiConfig.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ExceptionsController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VendaController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂model
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Venda.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VendaRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂exceptions
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VendaNaoEncontradaException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜VendaService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SwaggerApplication.java
 ┃ ┗ 📂resources
 ┃ ┃ ┗ 📜application.yml
 ┗ 📂test
 ┃ ┗ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂example
 ┃ ┃ ┃ ┃ ┗ 📂swagger
 ┃ ┃ ┃ ┃ ┃ ┗ 📜SwaggerApplicationTests.java
```


## Pré-requisitos

- **Java 17** ou superior
- **Maven** para gerenciamento de dependências

## Configuração do Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/rafael-iftm/swagger.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd swagger
   ```

3. Compile e rode o projeto usando Maven:
   ```bash
   mvn spring-boot:run
   ```

## Documentação da API

A documentação da API é gerada automaticamente usando o Swagger/OpenAPI e pode ser acessada em:

   ```bash
    http://localhost:8080/swagger-ui/index.html
   ```

## Endpoints Principais
- GET /vendas/sem-desconto: Retorna todas as vendas sem desconto.
- GET /vendas/com-desconto: Retorna todas as vendas com desconto.
- GET /vendas/ordenado-por-valor: Retorna todas as vendas ordenadas por valor unitário.
- GET /vendas/mais-vendido-na-nf/{idNf}: Retorna o produto mais vendido em uma NF específica.
- GET /vendas/nf-com-mais-dez-unidades: Retorna NFs com mais de dez unidades vendidas.
- GET /vendas/nf-com-valor-maior-que-500: Retorna NFs com valor total maior que 500.

## Tratamento de Exceções
As exceções são tratadas pelo ExceptionsController, que captura exceções personalizadas como VendaNaoEncontradaException e retorna respostas adequadas com os códigos de status HTTP.
