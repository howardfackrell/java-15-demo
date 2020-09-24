FROM openjdk:15-alpine

COPY . .

CMD ./mvnw test
