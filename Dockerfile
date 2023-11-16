FROM maven:3.8.3-openjdk-17 as build
WORKDIR /project-dir
COPY . .
RUN mvn -B -DskipTests clean package

FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /project-dir/target/back_end-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar back_end-0.0.1-SNAPSHOT.jar"]