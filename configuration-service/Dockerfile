FROM adoptopenjdk:11-jre-hotspot-focal
MAINTAINER Anirban Das <anirbandas18@live.com>
RUN mkdir ~p /opt/sharenow-coding-challenge
COPY target/configuration-app.jar /opt/sharenow-coding-challenge/configuration-app.jar
EXPOSE 8888
VOLUME /opt/sharenow-coding-challenge/configuration-store
CMD ["java", "-jar", "-Dspring.cloud.config.server.native.search-locations=file:${PROJECT_BASE_DIR}", "/opt/sharenow-coding-challenge/configuration-app.jar"]