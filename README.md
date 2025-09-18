# ☕︎ Study API

API Java com Spring Boot para estudos

## 📃 MER

![Imagem MER](assets/images/mer.png)

## 🔧 Instalação

* Clonar o repositório
  ```
  git clone https://github.com/lucaslimb/study-api-fiap.git
  ```
   
* Iniciar o banco de dados
  ```
  docker run -d \
    --name mysql \
    --rm \
    -e MYSQL_ROOT_PASSWORD=root_pwd \
    -e MYSQL_USER=new_user \
    -e MYSQL_PASSWORD=my_pwd \
    -p 3306:3306 \
    mysql
  ```

## Variáveis de ambiente
````bash
export $(cat .env | xargs)
---
export DB_USER=root
export DB_PASSWORD=root_pwd
export DB_SERVER=localhost
export DB_PORT=3306
export DB_DATABASE=devdv

````
## *Instruções* **Docker Compose**

  -  https://devhints.io/docker-compose
  - Docker image: https://hub.docker.com/repository/docker/lucaslimb/study-api-fiap/general

```
docker compose up
docker compose up db
docker compose stop
```

## 🌐 Navegação
-  Executar com **Maven**

```
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## 📖 Documentação da API (Swagger)
- http://localhost:9000/

## 📓 Referências

- https://springdoc.org/

## 📚 Descrição de Branches
 *Para registro dos conteúdos*

| Branch             | Descrição                                      |
|--------------------|-----------------------------------------------|
| **main**           | Código completo até o momento                |

| Branches Read Only | Descrição                                      |
|--------------------|-----------------------------------------------|
| **uc-http-codes**  | Http Methods                          |
| **uc-service-crud**| Http Methods + Service + Errors                                |
| **database-products**| Http Methods + Service + Errors + Database                  |
