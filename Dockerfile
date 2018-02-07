FROM openjdk:8
MAINTAINER restOdpowiedz
COPY *.jar restOdp.jar
EXPOSE 8080
CMD ["java","-jar","restOdp.jar"]
