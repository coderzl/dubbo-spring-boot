# dubbo-spring-boot-starter

## Quick Start

### provider配置

1. 在dubbo-provider-spring-boot-test项目下，application.yml中配置自己的zookeeper地址

    ```yaml
    dubbo:
      registry-address: zookeeper://xxxx:2181
    ```

2. 运行`DubboProviderSpringBootTestApplication`

### consumer配置

1. 在dubbo-consumer-spring-boot-test项目下，application.yml中配置自己的zookeeper地址
   
    ```yaml
    dubbo:
     registry-address: zookeeper://xxxx:2181
    ```

2. 运行`DubboConsumerSpringBootTestApplication`

### 访问

5. 打开浏览器，访问 `http://127.0.0.1:8099/hello`