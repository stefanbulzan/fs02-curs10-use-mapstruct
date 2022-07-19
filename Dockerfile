FROM eclipse-temurin:17
WORKDIR app

ADD target/curs10.jar application.jar

CMD java -jar application.jar