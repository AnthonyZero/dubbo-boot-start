# SpringBoot+zk+dubbo架构实践简单示例

* 一 本地部署zookeeper

[下载zookeeper](http://zookeeper.apache.org/)，我使用的版本是：zookeeper-3.4.12

将下载后的 zookeeper 解压，在 conf/ 下，复制zoo_sample.cfg重命名为 zoo.cfg 文件

```
tickTime=2000  
dataDir=/var/lib/zookeeper  
clientPort=2181  
```

按照自己需要可以修改tickTime 心跳时间 dataDir数据目录 clientPort客户端连接端口

启动 Zookeeper 服务（如果是windows，则使用.cmd文件）
> bin>zKServer.cmd

客户端即可连接 Zookeeper服务器
> bin>zkCli.cmd -server 127.0.0.1:2181

* 二 Dubbo-admin管理平台安装

转向 https://github.com/apache/incubator-dubbo-ops 按照README.md操作

得到dubbo-admin-2.0.0.war解压到tomcat服务器中,找到 WEB-INF/dubbo.properties 文件并修改其中配置
```
dubbo.registry.address=zookeeper://127.0.0.1:2181
dubbo.admin.root.password=root
dubbo.admin.guest.password=guest

```
启动 zookeeper 服务后再启动 tomcat 服务器，成功后便可在浏览器中访问并看到如下界面，说明已经安装成功。
