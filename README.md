# Spring Boot upload Multiple Files example - Multipart File

For more detail, please visit:
> [Spring Boot Multiple Files upload example](https://bezkoder.com/spring-boot-upload-multiple-files/)

## Run Spring Boot application
```
mvn spring-boot:run
```

## Configure MySql Server for Storage
```
*   If you have mysql Community Server in your system
*   create new database named filesdb
*   configure username and password for your mysql server in properties following paste in property file
```
* Properties 
```
#PASTE FOLLOWING CODE IF U WANNA CONNECT THIS APP WITH MYSQL COMMUNITY SERVER
spring.datasource.url=jdbc:mysql://localhost:3306/filesdb?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=username
spring.jpa.hibernate.ddl-auto=update
spring.datasource.password=password
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
logging.level.org.hibernate.sql=DEBUG
logging.level.org.hibernate.type=TRACE
server.port=9091    
```
## Configure xampp server
If you have mysql xampp server then configure following properties
```
spring.datasource.url=jdbc:mysql://localhost:3306/filesdb?useUnicode=true&useJDBCCompliantTimezoneShif=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
server.port=9090

```
