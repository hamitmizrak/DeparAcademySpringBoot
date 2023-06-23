# JDK 17
FROM openjdk:17-oracle
ARG JAR_FILE=DeparAcademySpringBoot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} depar.jar
ENTRYPOINT ["java","-jar","/depar.jar"]