FROM openjdk:17
EXPOSE 6005
ADD target/shopping-feedback-docker.jar shopping-feedback-docker.jar
ENTRYPOINT ["java","-jar","shopping-feedback-docker.jar"]