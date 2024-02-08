FROM amazoncorretto:latest
COPY /build/libs/ArtistMetadataIndex-0.0.1.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]