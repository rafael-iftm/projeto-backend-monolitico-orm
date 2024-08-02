# Guia de Início e Teste para o Sistema de Delivery

## Requisitos

- Java 17
- Maven
- Postman ou um editor com suporte a arquivos `.http` (opcional)
- [Visual Studio Code](https://code.visualstudio.com/) com a extensão [REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client) (opcional)

## Iniciando a Aplicação

1. **Clonar o Repositório**

   Primeiro, clone o repositório da aplicação para o seu ambiente local:

   ```bash
   git clone https://github.com/rafael-iftm/projeto-backend-monolitico-orm.git
   cd delivery
   ```

2. **Compilar e Executar a Aplicação**

   Utilize o Maven para compilar e executar a aplicação:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

A aplicação será iniciada no endereço padrão http://localhost:8080.

# Testando a Aplicação

## Usando o Postman

### Instalar o Postman

- Baixe e instale o [Postman](https://www.postman.com/downloads/).

### Criar uma Nova Requisição

1. Abra o Postman.
2. Clique em "New" e selecione "Request".
3. Dê um nome para a requisição e clique em "Save".

### Configurar a Requisição

#### Adicionar Rastreamento (POST)

- **Método**: POST
- **URL**: `http://localhost:8080/rastreamentos`
- **Body (JSON)**:
    ```json
    {
      "dataHora": "2024-08-01T12:00:00Z",
      "status": "em trânsito",
      "localizacao": "São Paulo"
    }
    ```

#### Obter Rastreamentos (GET)

- **Método**: GET
- **URL**: `http://localhost:8080/rastreamentos/{id_pacote}`

#### Adicionar Pacote (POST)

- **Método**: POST
- **URL**: `http://localhost:8080/pacotes`
- **Body (JSON)**:
    ```json
    {
      "id": "pacote1",
      "destinatario": "João Silva",
      "endereco": {
        "rua": "Rua das Flores",
        "numero": "123",
        "cidade": "São Paulo",
        "estado": "SP",
        "cep": "01234-567"
      },
      "status": "pendente"
    }
    ```

### Enviar a Requisição

- Clique em "Send" para enviar a requisição e verifique a resposta no painel "Response".

## Usando Arquivo `.http` no Visual Studio Code

### Instalar o Visual Studio Code

- Baixe e instale o [Visual Studio Code](https://code.visualstudio.com/).

### Instalar a Extensão REST Client

1. Abra o Visual Studio Code.
2. Vá para a aba de extensões (ícone de quadrado na barra lateral esquerda).
3. Procure por "REST Client" e instale a extensão.

### Criar o Arquivo de Teste

1. Na raiz do projeto, crie um arquivo chamado `test.http`.
2. Adicione o seguinte conteúdo:

    ```http
    ### Testar Adição de Rastreamento
    POST http://localhost:8080/rastreamentos
    Content-Type: application/json

    {
      "dataHora": "2024-08-01T12:00:00Z",
      "status": "em trânsito",
      "localizacao": "São Paulo"
    }

    ### Testar Obtenção de Rastreamentos
    GET http://localhost:8080/rastreamentos/{id_pacote}
    ```

### Executar o Arquivo `.http`

1. Abra o arquivo `test.http` no Visual Studio Code.
2. Passe o cursor sobre qualquer requisição e clique no botão "Send Request" que aparece acima dela.
