FROM openjdk:11
ADD /target/Student-0.0.1-SNAPSHOT.jar student.jar
ENTRYPOINT ["java", "-jar", "student.jar"]