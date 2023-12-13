FROM jdk:11
LABEL authors="user"
EXPOSE 8084
ADD target/msCandidat-0.0.1-SNAPSHOT.jar msCandidat.jar



ENTRYPOINT ["java", "-jar","msCandidat.jar"]