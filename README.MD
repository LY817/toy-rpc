# 概述
模仿dubbo的架构 写一个简易的rpc框架
默认接入springboot

# 功能模块
## `rpc-core` 通用功能
被其他模块引用
接口定义：元数据定义、通用注解

### 通信实现 
默认使用netty作为通信实现

- 通信协议 tcp自定义消息体
  
- 线程模型
  - 同步调用 调用后阻塞直到返回
  - 异步调用 返回一个future对象


## `rpc-provider` 服务提供者实现

## `rpc-consumer` 服务消费者实现

## `rpc-registry` 服务注册发现

## `rpc-protocol` 通信协议
### 对象序列化
- HESSIAN
- JSON