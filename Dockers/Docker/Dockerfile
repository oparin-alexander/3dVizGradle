FROM openjdk:8-jdk

WORKDIR /app

USER root

COPY ./build/libs /app/

VOLUME /app/data/

COPY ./libraries /app/libraries

RUN chmod -R +x /app

EXPOSE 4567

ENTRYPOINT java -cp libraries/ \
           -Xms2096M -Xmx2096M \
           -Djava.library.path=/app/libraries/opencv-3.4.0/build/lib \
           -jar 3dviz-1.0-SNAPSHOT.jar \