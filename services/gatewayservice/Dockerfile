FROM openjdk:8-jdk-alpine

ADD target/gateway-service.jar app.jar

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:MaxRAMFraction=1 -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]