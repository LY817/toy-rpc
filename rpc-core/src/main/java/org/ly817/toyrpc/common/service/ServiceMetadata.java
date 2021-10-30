package org.ly817.toyrpc.common.service;

import lombok.Data;

/**
 * @author LY
 * @date 2021/10/24 20:57
 * <p>
 * Description:
 * 暴露服务的元数据
 * - provider服务注册
 * - consumer服务调用
 */
@Data
public class ServiceMetadata {

    private String serviceName;

    private String serviceVersion;

    private String serviceAddr;

    private int servicePort;
}
