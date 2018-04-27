FROM openjdk:8-jdk

MAINTAINER Grupo Netshoes

ADD src/main/bash /opt/run.sh
RUN chmod +x /opt/run.sh
ADD target/sample-sleuth-notification.jar /opt/sample-sleuth-notification.jar
EXPOSE 8081
CMD exec /opt/run.sh