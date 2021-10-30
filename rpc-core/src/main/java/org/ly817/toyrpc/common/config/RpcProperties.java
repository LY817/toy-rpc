package org.ly817.toyrpc.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 */
@Data
@ConfigurationProperties(prefix = "toy-rpc")
public class RpcProperties {

    private int servicePort;

    private String registryAddr;

    private String registryType;

}
