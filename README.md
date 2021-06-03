# SecExample


>为了准备开发人员的安全培训，简单写了个靶场，有问题可以直接提Issues.

本漏洞靶场包含：

* SQL 注入漏洞
* XSS 漏洞
* SSRF 漏洞
* RCE 漏洞
* Fastjson反序列化漏洞

## 使用说明

使用前：修改配置文件（src/main/resources/application.yml）中数据库的配置

创建名为mybatis的database,然后导入doc目录下的sql文件。

## 靶场展示

### 首页
![img.png](images/img.png)
### SQL 注入漏洞
![img.png](images/sql.png)
### XSS 漏洞
![img.png](images/xss.png)
### SSRF 漏洞
![img_1.png](images/ssrf.png)
### RCE 漏洞
![img_2.png](images/rce.png)
### Fastjson反序列化漏洞
![img_3.png](images/fastjson.png)