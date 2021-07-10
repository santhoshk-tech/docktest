FROM openjdk:8
ADD target/docktest-0.0.1-SNAPSHOT.jar docktest-0.0.1-SNAPSHOT.jar
EXPOSE 8009
ENTRYPOINT ["java","-jar","docktest-0.0.1-SNAPSHOT.jar"]