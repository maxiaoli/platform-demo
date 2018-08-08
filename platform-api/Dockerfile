# 部署单元 docker 镜像构建文件配置

FROM openjdk:8u171

MAINTAINER leonzhangxf@gamil.com

VOLUME /tmp /tmp

ARG JAR_FILE

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]