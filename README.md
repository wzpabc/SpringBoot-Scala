## SpringBoot-Scala
`note`
*integrate with swagger2

run `gradle build` in terminal,please don't use gradle tool for idea, it is no working base on my testing

![gradle](./imgs/gradle.png)

`java -jar  ./build/libs/spring-boot-scala-0.1.0.jar`

![run jar](./imgs/run.png)

visit `http://localhost:8080/swagger-ui.html#/`

![api](./imgs/api.png)

![mvn](./imgs/mvn.png)

`mvn clean`

`mvn package -Dmaven.test.skip=true`

`jar -tvf target/spring-boot-scala-1.0.0.jar`

`java -jar target/spring-boot-scala-1.0.0.jar`