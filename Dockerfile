FROM  openjdk:17-oracle
VOLUME /tmp
ARG JAR_FILE
COPY target/config-server-erp-0.0.1-SNAPSHOT.jar config-server-erp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/config-server-erp-SNAPSHOT.jar"]