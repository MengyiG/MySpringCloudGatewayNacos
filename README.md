## Spring Gateway and Nacos Service Discovery

This project is to check how to use nacos to achieve  Service Discovery and Dynamic Configuration Management
* Set up [Nacos](https://nacos.io/en-us/docs/v2/quickstart/quick-start.html)
  * downlaod and start up nacos, the default port is 8848.
    * [localhost:8848/nacos](localhost:8848/nacos)
  * create configuration
  * [video tutorial](https://www.bilibili.com/video/BV1WZ4y1w7ww/?p=2&vd_source=d216e0483cb2bc8d1140b35f1674e41d)
* Dynamic routing with Gateway
  * [video](https://www.bilibili.com/video/BV1WV411L7xP/?spm_id_from=333.337.search-card.all.click&vd_source=d216e0483cb2bc8d1140b35f1674e41d)
  * [blog](https://blog.csdn.net/nyist_zxp/article/details/131865180)
  * [other resources](https://blog.51cto.com/u_10535186/5382540#4nacos_99)

### Config of gateway.yml
~~~~
spring:
  cloud:
    gateway:
      routes:
        - id: service1
          uri: lb://ServiceOne
          predicates:
            - Path=/service1/**
          filters:
            - StripPrefix=1
        - id: service2
          uri: lb://ServiceTwo
          predicates:
            - Path=/service2/**
          filters:
            - StripPrefix=1
~~~~

Before setup: 
* Service 1: http://localhost:8091/index1
* Service 2: http://localhost:8092/index2
* gateway: http://localhost:8090/gateway

After setup:
* Service 1: http://localhost:8092/index1
* Service 2: http://localhost:8091/index2