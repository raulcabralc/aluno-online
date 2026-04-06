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

## 📂 Estrutura de Pastas e Responsabilidades

(MVC) O projeto está organizado em camadas para separar a lógica de negócio do acesso aos dados:

* **`controllers/`**
* **`services/`**
* **`models/`**
* **`repositories/`**
* **`AlunoOnlineApplication.java`**

## 📝 Detalhamento Técnico do Projeto

O sistema foi desenvolvido seguindo o padrão de camadas do **Spring Boot**, garantindo a separação de responsabilidades e facilidade de manutenção.

### 1. Modelo de Dados (Entities)
Localizado em `models/`, utiliza o **JPA (Java Persistence API)** para mapear as classes Java para tabelas do banco de dados.
* **Anotações:** `@Entity` define a tabela e `@Id` com `@GeneratedValue` gerencia o auto-incremento dos IDs.
* **Lombok:** O uso de `@Data`, `@NoArgsConstructor` e `@AllArgsConstructor` elimina a necessidade de escrever Getters, Setters e construtores manualmente.

### 2. Camada de Persistência (Repositories)
A interface `AlunoRepository` estende `JpaRepository`. 
* Permite realizar operações de CRUD (`save`, `findAll`, `deleteById`) sem escrever código SQL, utilizando os métodos padrão do Spring Data JPA.

### 3. Regras de Negócio (Services)
A camada `services/` isola a lógica da aplicação.
* No processo de **Update**, o serviço busca o registro existente pelo ID, valida os novos dados e sincroniza as alterações, evitando que campos não enviados no JSON sobrescrevam dados importantes no banco.

### 4. Controle de Requisições (Controllers)
Os Controllers gerenciam os protocolos HTTP e a comunicação com o cliente (Postman/Frontend):
* **`@PostMapping`**: Criação de novos registros.
* **`@GetMapping`**: Consulta de dados.
* **`@PutMapping`**: Atualização de registros existentes.
* **`@DeleteMapping`**: Remoção de dados.
* **`@RequestBody`**: Responsável por transformar o JSON recebido na requisição em um objeto Java pronto para uso.

## ⚙️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/raulcabralc/aluno-online.git
    ```
2. Certifique-se de configurar as credenciais do banco de dados no arquivo `src/main/resources/application.properties`.
3. Execute a aplicação via Maven:
    ```bash
   mvn spring-boot:run
   ```

## 📸 Prints do Projeto

<div align-items="center">
   <img src="https://github.com/raulcabralc/aluno-online/blob/master/assets/dbeaver%202.png" width=500 />
   <img src="https://github.com/raulcabralc/aluno-online/blob/master/assets/dbeaver%201.png" width=500 />
   <img src="https://github.com/raulcabralc/aluno-online/blob/master/assets/postman%202.png" width=500 />
   <img src="https://github.com/raulcabralc/aluno-online/blob/master/assets/postman%201.png" width=500 />
</div>
