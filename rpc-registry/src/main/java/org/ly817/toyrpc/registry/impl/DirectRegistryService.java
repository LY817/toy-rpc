package org.ly817.toyrpc.registry.impl;

import org.ly817.toyrpc.common.config.RpcProperties;
import org.ly817.toyrpc.common.service.ServiceMetadata;
import org.ly817.toyrpc.registry.RegistryLocalCache;
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

    RegistryLocalCache registryLocalCache;

    RpcProperties rpcProperties;

    public DirectRegistryService(RpcProperties rpcProperties) {
        this.rpcProperties = rpcProperties;
        init();
    }

    /**
     * 注册服务到注册中心
     *
     * @param serviceMeta
     * @throws Exception
     */
    @Override
    public void register(ServiceMetadata serviceMeta) throws Exception {
        // 服务提供者不需要注册
    }

    /**
     * 从注册中心注销服务
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
     *
     * @param serviceName
     * @param invokerHashCode
     * @return
     * @throws Exception
     */
    @Override
    public ServiceMetadata discovery(String serviceName, int invokerHashCode) throws Exception {
        // todo 负载均衡策略
        return registryLocalCache.get(serviceName,invokerHashCode);
    }

    @Override
    public void destroy() throws IOException {

    }

    @Override
    public String registryType() {
        return "DIRECT";
    }

    /**
     * 初始化
     * 从注册中心拉取数据到本地缓存 RegistryLocalCache
     * todo 启动维护（定时刷新）本地缓存的轮训任务
     * - 客户端/服务端：发心跳到各个服务 来确保服务都是在线状态 避免调用到有问题的服务上
     * - 客户端：定时拉取注册中心服务列表
     */
    @Override
    public void init() {
        // 将配置中读到的固定服务配置复制到本地的缓存中
        registryLocalCache = new RegistryLocalCache(rpcProperties.getServices());
    }
}
