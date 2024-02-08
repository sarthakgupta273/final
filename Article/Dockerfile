FROM openjdk:latest
WORKDIR usr/lib
EXPOSE 8880
ADD ./target/Article-0.0.1-SNAPSHOT.jar /usr/lib/Article-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","Article-0.0.1-SNAPSHOT.jar"]
