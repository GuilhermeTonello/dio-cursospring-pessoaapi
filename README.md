# Digital Innovation One: Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot

Curso realizado a partir do Bootcamp GFT START #2 Java da Digital Innovation One (DIO).

## Tópicos abordados no curso:
- Setup do projeto feito com o Spring Initializr ([https://start.spring.io/](https://start.spring.io/))
- Mapeamento de entidades usando o Hibernate juntamento do Spring Data JPA
- Desenvolvido um CRUD padrão de pessoas usando API REST (Endpoints da API mais abaixo)
- Subindo o projeto pro Heroku

### Executando e acessando o projeto:

##### Para executar digite no terminal:
mvnw spring-boot:run

##### Para acessar utilize a URL:
localhost:8080/api/v1/pessoa

## Endpoints da API:
|Objetivo                   | Método HTTP | Endpoint            |
|:-------------------------:|:-----------:|:-------------------:|
|Consultar todas as pessoas | GET         | /api/v1/pessoa      |
|Consultar uma pessoa       | GET         | /api/v1/pessoa/{id} |
|Salvar uma pessoa          | POST        | /api/v1/pessoa      |
|Atualizar uma pessoa       | PUT         | /api/v1/pessoa/{id} |
|Deletar uma pessoa         | DELETE      | /api/v1/pessoa/{id} |

Observação: Para o método POST e PUT deve-se passar no corpo da requisição os valores dos campos da pessoa

## Requisitos para o projeto:
Java 11 ou versões superiores
