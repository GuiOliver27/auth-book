# Spring Security e JWT
Este é um projeto que demonstra como configurar o Spring Security para autenticação baseada em tokens JWT em uma aplicação web.

## Como Funciona
Este projeto utiliza o Spring Security para proteger endpoints RESTful da aplicação.
A autenticação é feita através de tokens JWT (JSON Web Tokens),
que são gerados quando o usuário faz login e enviados no cabeçalho de autorização de requisições subsequentes.

## Configuração do Spring Security
A classe `SecurityConfiguration` configura o Spring Security para habilitar a autenticação baseada em tokens JWT.
Ela define uma cadeia de filtros de segurança que intercepta requisições, verifica a presença do token JWT e autentica o usuário com base no token.

## Geração e Validação de Tokens JWT
A classe `JwtService` é responsável por gerar e validar tokens JWT. Ela utiliza a biblioteca `io.jsonwebtoken` para realizar essas operações.
O método `generateToken` gera um token JWT com base nas informações do usuário, enquanto o método `isTokenValid` verifica se um token JWT é válido.

## Filtros de Autenticação JWT
O filtro `JwtAuthenticationFilter` é responsável por interceptar requisições e validar o token JWT presente no cabeçalho de autorização.
Se o token for válido, ele autentica o usuário e permite o acesso ao endpoint solicitado.

## Tecnologias Utilizadsa
- Java 17
- Maven
- Spring Boot 3.2.5
- Spring Web
- Spring Data JPA
- Spring Security
- MySQL
- Lombok
- JSON Web Token
