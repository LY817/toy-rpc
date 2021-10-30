package org.ly817.toyrpc.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

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

}
