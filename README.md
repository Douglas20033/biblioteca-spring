📚 Sistema de Gerenciamento de Biblioteca Digital

Este é um projeto simples de gerenciamento de biblioteca desenvolvido com Spring Boot. Ele permite operações básicas de CRUD (Criar, Ler, Atualizar e Deletar) em um acervo de livros. Ideal para fins educacionais, principalmente em disciplinas como Programação Orientada a Objetos e Desenvolvimento Web.

🔧 Tecnologias Utilizadas

Java 21

Spring Boot 3.4.5

Spring Data JPA

Banco de dados H2 (memória)

Maven

Visual Studio Code

Thunder Client (para testes de API)

🚀 Como Executar o Projeto

1. Pré-requisitos

Java 17 ou superior

Maven instalado (verifique com mvn -v)

VS Code ou outro IDE compatível com Java

Git (opcional para clonar o repositório)

2. Clonar o repositório

git clone https://github.com/Douglas20033/biblioteca-spring.git
cd biblioteca-spring

3. Executar o projeto

mvn spring-boot:run

Após a inicialização, o sistema estará disponível em:

http://localhost:8080

📊 Endpoints da API

GET /livros: Lista todos os livros

GET /livros/{id}: Busca um livro por ID

POST /livros: Adiciona um novo livro

PUT /livros/{id}: Atualiza os dados de um livro

DELETE /livros/{id}: Remove um livro

Exemplo de requisição POST (JSON):

{
  "titulo": "Dom Casmurro",
  "autor": "Machado de Assis",
  "anoPublicacao": 1899
}

📁 Estrutura do Projeto

src
└─ main
   ├─ java
   │  └─ com.example.gerenciador
   │     ├─ controller
   │     ├─ model
   │     └─ repository
   └─ resources
      ├─ application.properties

🚧 Banco de Dados H2

O banco de dados H2 é executado em memória, e você pode acessá-lo pelo navegador em:

http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Importante: O H2 é ideal para testes. Se desejar usar o MySQL ou outro banco, atualize o application.properties com as credenciais corretas.

🙌 Contribuição

Este projeto foi desenvolvido como um trabalho acadêmico. Sugestões e melhorias são bem-vindas!

📦 Autor

Douglas20033Repositório GitHub: biblioteca-spring

