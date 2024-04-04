## 背景



1．前端开发需要用到后台接口 

2．使用现成的系统的功能(http://api.btstu.cn/)

做一个API接口平台:

1防止攻击（安全性)

2不能随便调用(限制、开通)

3统计调用次数

4计费

5流量保护

6API接入

## 项目介绍
做一个提供API接口调用的平台，用户可以注册登录，开通接口调用权限。用户可以使用接口，并且每次调用会进行统计。管理员可以发布接口、下线接口、接入接口，以及可视化接口的调用情况、数据。


## 技术选型
### 前端：

● React 18 

● Ant Design Pro 5.x 脚手架 

● Ant Design & Procomponents 组件库 

● Umi 4 前端框架 

● OpenAPI 前端代码生成 

### 后端：

●Java Spring Boot

●MySQL 数据库

●MyBatis-Plus 及 MyBatis X 自动生成

●API 签名认证（Http 调用）

●Spring Boot Starter（SDK 开发）

●Dubbo 分布式（RPC、Nacos）

●Swagger + Knife4j 接口文档生成

●Spring Cloud Gateway 微服务网关

●Hutool、Apache Common Utils、Gson 等工具库

## 需求分析
1. 管理员可以对接口信息进行增删改查

2. 用户可以访问前台，查看接口信息
   
3. 用户可以调用接口

4. 管理员可以查看接口调用次数分析图
   
## 效果展示

### 登录页面

![image](https://github.com/Serendipityzhezi/zheapi-backend/assets/122675076/f84fd2b5-6a6a-4fd6-a89e-b43c5fa7a422)

### 主界面

![image](https://github.com/Serendipityzhezi/zheapi-backend/assets/122675076/a87727b6-5f34-4ad6-ab54-07e555c91288)


### 调用接口

可以调用已发布的接口

![image](https://github.com/Serendipityzhezi/zheapi-backend/assets/122675076/10f3cee0-2664-41d8-8434-d95da04b92dd)


### 管理页

可以新建，删除，修改，查询，发布，下线接口

![image](https://github.com/Serendipityzhezi/zheapi-backend/assets/122675076/9d4feb53-de32-4a12-a6b1-673b5c70db2c)


### 接口分析页

可分析出调用次数TOP3的接口

![image](https://github.com/Serendipityzhezi/zheapi-backend/assets/122675076/d45f73f8-d588-4440-a372-facd9ba35811)


 
