# Sistema de Delivery

## Requisitos:
- Java 11
- Maven
- Spring Boot 2.7.0
- H2 Database (em memória)
- Swagger (OpenAPI)

## Como rodar a aplicação:
1. Clone o repositório:

git clone https://github.com/Janice-hub-lab/cliente-pedido.git

2. Navegue até a pasta do projeto:

cd delivery-system

3. Compile e rode o projeto:

mvn spring-boot

## Endpoints:

### Cliente:
- `GET /clientes` - Listar todos os clientes.
- `POST /clientes` - Adicionar um novo cliente.
- `PATCH /clientes/{id}` - Alterar cliente pelo ID.
- `DELETE /clientes/{id}` - Remover cliente pelo ID.

### Pedido:
- `GET /pedidos` - Listar todos os pedidos.
- `POST /pedidos` - Adicionar um novo pedido.
- `PATCH /pedidos/{id}` - Alterar pedido pelo ID.
- `DELETE /pedidos/{id}` - Remover pedido pelo ID.

### Entrega:
- `GET /entregas` - Listar todas as entregas.
- `POST /entregas` - Adicionar uma nova entrega.
- `PATCH /entregas/{id}` - Alterar entrega pelo ID.
- `DELETE /entregas/{id}` - Remover entrega pelo ID.

