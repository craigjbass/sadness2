FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/sadness2.jar /sadness2/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/sadness2/app.jar"]
