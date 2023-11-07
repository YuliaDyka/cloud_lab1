FROM alpine/git as clone
WORKDIR /repo
RUN git clone --branch lab_2 https://github.com/YuliaDyka/cloud_lab1.git

FROM maven:3.8.3-openjdk-17 as build
WORKDIR /src
COPY --from=clone /repo/cloud_lab1 .
RUN mvn install

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /src/target/back_end-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar back_end-0.0.1-SNAPSHOT.jar"]