package org.ly817.toyrpc.registry.impl;

import org.ly817.toyrpc.common.service.ServiceMetadata;
import org.ly817.toyrpc.registry.RegistryService;

import java.io.IOException;

/**
 * @author LY
 * @date 2021/10/30 10:34
 * <p>
 * Description:
 * 直连实现
 * 通过配置文件中约定的服务ip和端口
 *
 */
public class DirectRegistryService implements RegistryService {
    /**
     * 注册服务
     *
     * @param serviceMeta
     * @throws Exception
     */
    @Override
    public void register(ServiceMetadata serviceMeta) throws Exception {
        // 服务提供者不需要注册
    }

    /**
     * 注销服务
     *
     * @param serviceMeta
     * @throws Exception
     */
    @Override
    public void unRegister(ServiceMetadata serviceMeta) throws Exception {
        // 服务提供者不需要注销
    }

    /**
     * 获取服务实例
     * 从springboot配置中读取
     *
     * @param serviceName
     * @param invokerHashCode
     * @return
     * @throws Exception
     */
    @Override
    public ServiceMetadata discovery(String serviceName, int invokerHashCode) throws Exception {
        return null;
    }

    @Override
    public void destroy() throws IOException {

    }

    @Override
    public String registryType() {
        return "DIRECT";
    }
}
