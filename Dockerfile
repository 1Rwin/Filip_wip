FROM openjdk:13
LABEL mainteiner=ivan.nikolaev@dbschenker.com

ARG APPLICATION_NAME
ADD target/$APPLICATION_NAME.jar /app.jar

RUN mkdir -p /root/.postgresql \
    && curl -SL https://s3.amazonaws.com/rds-downloads/rds-ca-2019-root.pem > /root/.postgresql/root.crt
CMD ["java", \
    "-agentlib:jdwp=transport=dt_socket,address=8000,suspend=n,server=y", \
    "-Duser.timezone=UTC", \
    "-Djava.security.egd=file:/dev/./urandom", \
    "-XX:-UseGCOverheadLimit", \
    "-jar", \
    "-Xmx2G", \
    "/app.jar"]
