# API de CRUD de Clientes com Spring Boot

Este é um projeto de uma API desenvolvida em Spring Boot que permite realizar operações CRUD (Create, Read, Update, Delete) em clientes. A aplicação roda na porta 8080 e possui documentação em Swagger na rota /swagger-ui.html.

## Requisitos

Certifique-se de ter os seguintes requisitos instalados:

- Java JDK (versão 8 ou superior)
- Maven

## Executando a aplicação

Siga as etapas abaixo para executar a aplicação:

1. Clone o repositório para o seu ambiente local.

```
git clone https://github.com/enilsonfilho/crud-api-springboot.git
```

2. Acesse o diretório do projeto.

```
cd nome-do-repositorio
```

3. Compile o projeto com o Maven.

```
mvn clean install
```

4. Execute a aplicação.

```
java -jar target/nome-do-arquivo.jar
```

5. Acesse a documentação Swagger no seu navegador.

```
http://localhost:8080/swagger-ui.html
```

**OBS:** Tenha o PostgreSQL instalado e um banco de dados disponível para API, para mais detalhes, acesse o arquivo de configuração **.properties**

## Endpoints da API

A API de CRUD de Clientes possui os seguintes endpoints:

- GET /api/clientes/listar: Retorna todos os clientes cadastrados.
- GET /api/clientes/listar/{id}: Retorna os detalhes de um cliente específico pelo seu ID.
- POST /api/cliente/gravar: Cria um novo cliente com base nos dados fornecidos. (Também utilizado para atualizar o cliente quando passado o ID do mesmo no Json)
- DELETE /api/cliente/deletar/{id}: Remove um cliente existente pelo seu ID.

Certifique-se de fornecer os dados corretos no corpo da requisição para as operações de criação e atualização.

## Tecnologias utilizadas

- Java
- Spring Boot
- Maven
- Swagger

## Licença

Este projeto está licenciado sob a MIT License.
