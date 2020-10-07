# API de Compras em Java + Spring

Modelo de domínio:
![Modelo de domínio da API](https://github.com/viniciusfinger/temp-api-spring/blob/master/imagens/modelo_dominio.PNG "Modelo de domínio da API")


# Documentação:

 Para acessar o banco de dados H2 (incorporado no projeto):
  * URL: {{url}}/h2-console/
  * JDBC-URL: jdbc:h2:mem:testdb
  * User: sa
  * Senha: (em branco)
 
 
 # End-points:
 Usuários:
 - Adicionar:  @POST {{url}}/users/id
 - Buscar todos:   @GET {{url}}/users
 - Buscar específico:  @GET {{url}}/users/id
  
 Pedidos:
 - Buscar todos:   @GET {{url}}/orders
 - Buscar específico:  @GET {{url}}/orders/id
   
 Categorias:
 - Buscar todas:   @GET {{url}}/categories
 - Buscar específica:  @GET {{url}}/categories/id
 
  Produtos:
 - Buscar todas:   @GET {{url}}/products
 - Buscar específica:  @GET {{url}}/products/id
