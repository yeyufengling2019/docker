FROM java:8
VOLUME /tmp
#ADD demo-0.0.1-SNAPSHOT.jar /demo-0.0.1-SNAPSHOT.jar
COPY pom.xml ./pom.xml
RUN mvn clean package
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-0.0.1-SNAPSHOT.jar"]