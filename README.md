# springboot-springbatch-app

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.esprit.examen.Application` class from your IDE.

Install dependecies before run project like:

`mvn clean install`


Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
```Intellij run button
run button in Intellij
```
##SpringBatch Issues
If some table doesn't created when you run project you should execute `batch.sql` from project `ressources` in your `SQLServer` **_Just copy the code in console_**

To connect to swagger just click [SwagerUrl](http://localhost:8089/SpringMVC/swagger-ui/index.html)