package org.ly817.toyrpc.common.config;

import lombok.Data;
import org.ly817.toyrpc.common.service.ServiceMetadata;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Data
@ConfigurationProperties(prefix = "toy-rpc")
public class RpcProperties {

    /**
     * rpc服务提供者端口
     */
    private int servicePort;

    /**
     * 注册中心地址
     */
    private String registryAddr;

    /**
     * 注册中心类型
     */
    private String registryType;

    /**
     * 写死的服务实例列表
     */
    private Map<String,List<ServiceMetadata>> services;

}
