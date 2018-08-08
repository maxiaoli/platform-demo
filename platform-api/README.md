部署单元
============================

之后新增的项目都会采用docker容器部署的形式，也将包括生产环境。

这里本地测试时可以先生成数据库 `test`，数据库表及实验数据见 `test-20180808.sql` 。

## 1.如果数据库是在宿主机上部署的

则需要在docker部署时，将数据库IP配置成docker映射的宿主机IP或者采用host方式部署：

### 1.1 采用IP形式直接配置

```yaml

url: jdbc:mysql://${宿主机IP}:${宿主机的MySQL服务端口}/test?characterEncoding=utf8&serverTimezone=Asia/Shanghai&useSSL=false

```

### 1.2 采用docker host配置方式

```yaml

url: jdbc:mysql://${宿主机HOST}:${宿主机的MySQL服务端口}/test?characterEncoding=utf8&serverTimezone=Asia/Shanghai&useSSL=false

```

```shell

docker run --add-host ${宿主机HOST}:${宿主机IP} --p ${宿主机连接端口}:${容器内服务暴露端口，这里根据配置文件中端口配置}

--name ${给该容器实例起的名字} ${使用的镜像及版本，这里DEMO构建镜像完毕后是：boot2:1.0.0} 

```

## 2. 如果数据库是在docker中部署的

则需要在部署数据时监听端口，或者在启动服务时，由服务单独连接数据库。

### 2.1 在数据库部署时

docker部署数据库，并暴露端口（这里可以不暴露端口到宿主机，因为后边服务是链接是容器间操作）

```shell

docker run -p ${宿主机监听端口}:${部署的数据库服务监听端口} 

--name ${MySQL服务名}

${使用的镜像及版本，这里使用的是官版 mysql:5.6.41} 

```

项目数据库连接配置

```yaml

url: jdbc:mysql://${服务在部署时链接MySQL服务的别名Alias}:${部署的数据库服务监听端口}/test?characterEncoding=utf8&serverTimezone=Asia/Shanghai&useSSL=false

```

服务部署

```shell

docker run --link ${刚才部署的MySQL服务名}:${数据库配置处配置的MySQL服务别名} 

--p ${宿主机连接端口}:${容器内服务暴露端口，这里根据配置文件中端口配置}

--name ${给该容器实例起的名字} ${使用的镜像及版本，这里DEMO构建镜像完毕后是：boot2:1.0.0} 

```

### 2.2 服务部署时单独连接数据库

同 1. 的服务部署，只是需要部署数据库时的暴露端口连接到宿主机的某个端口。

