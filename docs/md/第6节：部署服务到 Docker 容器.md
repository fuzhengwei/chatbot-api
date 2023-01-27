# 第6节：部署服务到 Docker 容器

## 资料

**如果你需要链接云服务，那么需要在远程 Docker 开启下面的配置**
```java
vim /usr/lib/systemd/system/docker.service
在ExecStart=/usr/bin/dockerd-current 后面加上 -H tcp://0.0.0.0:2375 -H unix://var/run/docker.sock \
重新加载配置文件
systemctl daemon-reload
重启启动
systemctl restart docker
```

## 脚本

```java
docker run -e PARAMS=" --chatbot-api.groupId=你的星球ID --chatbot-api.openAiKey=自行申请 --chatbot-api.cookie=登录cookie信息" -p 8090:8090 --name chatbot-api -d chatbot-api:1.0
```
