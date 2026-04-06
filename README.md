# Aluno Online API

Sistema de gestão escolar simples para o gerenciamento de registros de alunos e professores.

## 🚀 Funcionalidades

O projeto consiste em um **CRUD** (Create, Read, Update, Delete) completo para as seguintes entidades:

* **Alunos:** Cadastro, listagem, atualização de dados e remoção.
* **Professores:** Cadastro, listagem, atualização de dados e remoção.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Persistência:** Spring Data JPA
* **Banco de Dados:** PostgreSQL / MySQL (Configurável via application.properties)
* **Gerenciador de Dependências:** Maven

## 📂 Estrutura do Projeto

* `src/main/java`: Contém as camadas da aplicação (Controller, Service, Repository, Entity).
* `src/main/resources`: Arquivos de configuração e propriedades da aplicação.

## ⚙️ Como Executar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/seu-usuario/aluno-online.git](https://github.com/seu-usuario/aluno-online.git)]
    ```
2. Certifique-se de configurar as credenciais do banco de dados no arquivo `src/main/resources/application.properties`.
3. Execute a aplicação via Maven:
    ```bash
   mvn spring-boot:run
   ```