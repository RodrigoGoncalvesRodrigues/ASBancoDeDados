# 📦 API ASBancoDeDados

Esta é uma API REST desenvolvida em Java com Spring Boot, focada em gerenciar usuários, categorias e avaliações de serviços, utilizando MongoDB como banco de dados.

---

## 🧩 Collections

### 📁 Categorias

A entidade **Categoria** agrupa agrupa as avaliações de determinado Serviço. Possui os seguintes campos:

- `id`: Identificador único da categoria (`ObjectId do MongoDB`)

- `nome`: Nome da categoria (`String`)

- `descricao`: Lista a categoria da Avaliação (`String`)

---

### 👥 Usuarios

A entidade **Usuarios** representa os usuarios cadastrados. Possui os seguintes campos:

- `id`: Identificador único do produto (`ObjectId do MongoDB`)

- `nome `: Nome do Usuario (`String`)

- `email`: E-mail do Usuario (`String`)
  


---
### ⭐ Avaliações

A entidade **Avaliações ** representa as avaliaçções cadastradas pelos Usuarios. Possui os seguintes campos:

- `id`: Identificador único da avaliação (`ObjectId do MongoDB`)
  
- `usuario_id`: Referência ao usuário que fez a avaliação (`ObjectId do MongoDB`)
 
- `categoria_id`: Referência à categoria do item avaliado (`ObjectId do MongoDB`)

- `item_avaliado `: Nome do item avaliado (`String`)

- `nota`: Nota atribuída pelo usuário (`Integer`)

- `comentario`: Comentário escrito pelo usuário (`String`)

- `data_avaliacao`: Data em que a avaliação foi registrada (`Date`)
  
-  `localizacao`: Localização geográfica do serviço avaliado (objeto `Localizacao` com latitude/longitude; só aparece em avaliações de locais físicos) 🔑
---

🌐 Endpoints

🔹 Categorias: /categorias
| Método | Endpoint | Descrição                                     |
| ------ | -------- | --------------------------------------------- |
| GET    | `/`      | Retorna todas as categorias cadastradas       |
| GET    | `/{id}`  | Retorna uma **categoria específica** pelo ID  |
| POST   | `/`      | Cria uma nova categoria (`nome`, `descricao`) |
| PUT    | `/{id}`  | Atualiza uma categoria existente              |
| DELETE | `/{id}`  | Exclui uma categoria pelo ID                  |

🔹 Usuários: /usuarios
| Método | Endpoint | Descrição                                 |
| ------ | -------- | ----------------------------------------- |
| GET    | `/`      | Retorna todos os usuários cadastrados     |
| GET    | `/{id}`  | Retorna um **usuário específico** pelo ID |
| POST   | `/`      | Cria um novo usuário (`nome`, `email`)    |
| PUT    | `/{id}`  | Atualiza um usuário existente             |
| DELETE | `/{id}`  | Exclui um usuário pelo ID                 |

🔹 Avaliações: /avaliacoes
| Método | Endpoint | Descrição                                                                                                                      |
| ------ | -------- | ------------------------------------------------------------------------------------------------------------------------------ |
| GET    | `/`      | Retorna todas as avaliações cadastradas                                                                                        |
| GET    | `/{id}`  | Retorna uma **avaliação específica** pelo ID                                                                                   |
| POST   | `/`      | Cria uma nova avaliação (`usuario_id`, `categoria_id`, `item_avaliado`, `nota`, `comentario`, `data_avaliacao`, `localizacao`) |
| PUT    | `/{id}`  | Atualiza uma avaliação existente                                                                                               |
| DELETE | `/{id}`  | Exclui uma avaliação pelo ID                                                                                                   |


---

## 🚀 Tecnologias do Projeto

- Java 21

- Spring Boot

- Spring Data MongoDB

- MongoDB (com conexão via MongoDB Compass)

- RESTful API

- Gradle

