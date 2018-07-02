FROM openjdk:8-jdk-alpine

ADD target/stock-service.jar app.jar

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -XX:MaxRAMFraction=1 -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]