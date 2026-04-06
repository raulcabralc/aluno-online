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

### 📂 Estrutura de Pastas e Responsabilidades

(MVC) O projeto está organizado em camadas para separar a lógica de negócio do acesso aos dados:

* **`controllers/`**
* **`services/`**
* **`models/`**
* **`repositories/`**
* **`AlunoOnlineApplication.java`**

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
