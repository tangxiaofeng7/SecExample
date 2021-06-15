# SecExample

| 漏洞名称               | 难度 |
| ---------------------- | ---- |
| [SQL 注入漏洞]         | 🌟🌟  |
| [XSS 漏洞]             | 🌟    |
| [SSRF 漏洞]            | 🌟🌟  |
| [CORS 漏洞]             | 🌟🌟    |
| [RCE 漏洞]             | 🌟🌟  |
| [反序列化漏洞-Fastjson反序列化] | 🌟🌟🌟🌟 |
| [验证码相关漏洞] | 🌟🌟 |


### Docker启动

```git
git clone https://github.com/tangxiaofeng7/SecExample.git
cd SecExample
docker-compose up -d
```

然后访问：http://localhost:8080



### 本地调试

##### 下载源码：
```git
git clone https://github.com/tangxiaofeng7/SecExample.git
```
##### 使用idea导入

##### 编辑 src/main/resources/application.yml 的数据库配置
```
#    url: jdbc:mysql://localhost:3306/mybatis?serverTimezone=UTC&useSSL=false
    url: jdbc:mysql://mysql-db:3306/mybatis?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true
```
修改为
```
    url: jdbc:mysql://localhost:3306/mybatis?serverTimezone=UTC&useSSL=false
#    url: jdbc:mysql://mysql-db:3306/mybatis?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true
```
##### 本地启动mysql数据库
启动数据库：
```
mysql.server start
```
进入 mysql终端：
```
mysql -u root -p
```
导入sql文件：
```
source /xx/SecExample/mysql/init.sql(绝对路径)
```

##### 下载pom依赖
```
右键pom.xml =》 maven => 重新加载项目
```
##### 运行项目
```
运行 SecexampleApplication
```


### 靶场展示

#### 首页
![index.png](images/index.png)
