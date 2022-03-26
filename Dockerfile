FROM openjdk:8-alpine

COPY target/uberjar/myserver.jar /myserver/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/myserver/app.jar"]
