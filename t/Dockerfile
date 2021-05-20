FROM openjdk:11-jdk AS builder
WORKDIR source
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
RUN jar -xf ./app.jar

FROM openjdk:11-jre
WORKDIR application
COPY --from=builder source/BOOT-INF/lib lib
COPY --from=builder source/META-INF app/META-INF
COPY --from=builder source/BOOT-INF/classes app


ENTRYPOINT ["java","-cp","app:lib/*","com.example.love.k8s.Application"]

