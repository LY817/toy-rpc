package org.ly817.toyrpc.common.service;

import lombok.Data;

/**
 * @author LY
 * @date 2021/10/24 20:57
 * <p>
 * Description:
 */
@Data
public class ServiceMetadata {

    private String serviceName;

    private String serviceVersion;

    private String serviceAddr;

    private int servicePort;
}
