FROM openjdk:17
EXPOSE 6005
ADD target/shopping-feedback-service.jar shopping-feedback-service.jar
ENTRYPOINT ["java","-jar","shopping-feedback-service.jar"]