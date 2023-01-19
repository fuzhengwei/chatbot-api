# 第6节：部署服务到 Docker 容器

## 资料

```java
vim /usr/lib/systemd/system/docker.service
在ExecStart=/usr/bin/dockerd-current 后面加上 -H tcp://0.0.0.0:2375 -H unix://var/run/docker.sock \
重新加载配置文件
systemctl daemon-reload
重启启动
systemctl restart docker
```