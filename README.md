# API de Compras em Java + Spring

Modelo de domínio:
![Captura de tela](https://github.com/viniciusfinger/temp-api-spring/blob/master/imagens/modelo_dominio.PNG "Modelo de domínio da API")


# Documentação:

 Para acessar o banco de dados H2 (incorporado no projeto):
  * URL: {{url}}/h2-console/
  * JDBC-URL: jdbc:h2:mem:testdb
  * User: sa
  * Senha: (em branco)
 
 
 # End-points:
 Usuários:
 - Buscar todos:   {{url}}/users
 - Buscar específico:  {{url}}/users/id
  
 Pedidos:
 - Buscar todos:   {{url}}/orders
 - Buscar específico:  {{url}}/orders/id
   
 Categorias:
 - Buscar todas:   {{url}}/categories
 - Buscar específica:  {{url}}/categories/id
 
  Produtos:
 - Buscar todas:   {{url}}/products
 - Buscar específica:  {{url}}/products/id
