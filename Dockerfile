FROM amazoncorretto:17.0.10
COPY /build/libs/ArtistMetadataIndex-0.0.1.jar application.jar
ENTRYPOINT ["java", "-jar", "application.jar"]