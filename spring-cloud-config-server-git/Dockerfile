FROM java:8

COPY target/spring-cloud-config-server-git-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar" ,"/app.jar"]