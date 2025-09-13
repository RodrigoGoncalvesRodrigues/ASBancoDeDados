📦 API ASBancoDeDados

Esta é uma API REST desenvolvida em Java com Spring Boot, focada em gerenciamento de produtos e categorias, utilizando MongoDB como banco de dados.

🧩 Entidades
📁 Categoria

A entidade Categoria agrupa os produtos. Possui os seguintes campos:

id: Identificador único da categoria (ObjectId do MongoDB)

nomeCategoria: Nome da categoria (String)

produtos: Lista de produtos associados (List<Produto>)

📦 Produto

A entidade Produto representa os itens cadastrados. Possui os seguintes campos:

id: Identificador único do produto (ObjectId do MongoDB)

nomeProduto: Nome do produto (String)

precoProduto: Preço do produto (int)

categoria: Categoria à qual o produto pertence (referência a Categoria no MongoDB)

🌐 Endpoints
🔹 Categoria: /categorias
Método	Endpoint	Descrição
GET	/	Retorna todas as categorias e seus produtos
GET	/{id}	Retorna uma categoria específica pelo ID
POST	/	Cria uma nova categoria
PUT	/{id}	Atualiza uma categoria existente
DELETE	/{id}	Exclui uma categoria pelo ID
🔹 Produto: /produtos
Método	Endpoint	Descrição
GET	/	Retorna todos os produtos e suas categorias
GET	/{id}	Retorna um produto específico pelo ID
POST	/	Cria um novo produto
PUT	/{id}	Atualiza um produto existente
DELETE	/{id}	Exclui um produto pelo ID
🚀 Tecnologias utilizadas

Java 21

Spring Boot

Spring Data MongoDB

MongoDB (com conexão via MongoDB Compass)

RESTful API
