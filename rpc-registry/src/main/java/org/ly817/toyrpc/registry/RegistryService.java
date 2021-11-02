package org.ly817.toyrpc.registry;

import org.ly817.toyrpc.common.service.ServiceMetadata;
import org.ly817.toyrpc.registry.impl.DirectRegistryService;

import java.io.IOException;

/**
 * 注册中心操作接口
 * @author LuoYu
 * @date 2021-10-30
 *
 * 整体数据结构 serviceName - ServiceMetadata[] 键值对
 * 本地有一个map缓存
 * 根据不同的实现共享注册中心的内存实现服务注册和发现
 * 数据流向
 * 服务提供者 -> 注册中心 -> 本地缓存
 * 本地缓存要使用线程池轮询来维护
 * @see RegistryLocalCache
 *
 * - direct 直连
 * @see DirectRegistryService
 * - redis
 * - zookeeper
 * - nacos
 *
 *
 */
public interface RegistryService {

    /**
     * 注册服务
     * @param serviceMeta
     * @throws Exception
     */
    void register(ServiceMetadata serviceMeta) throws Exception;

    /**
     * 注销服务
     * @param serviceMeta
     * @throws Exception
     */
    void unRegister(ServiceMetadata serviceMeta) throws Exception;

    /**
     * 获取服务实例
     *
     * @param serviceName
     * @param invokerHashCode
     * @return
     * @throws Exception
     */
    ServiceMetadata discovery(String serviceName,int invokerHashCode) throws Exception;


    void destroy() throws IOException;

    String registryType();

    /**
     * 初始化
     * 从注册中心拉取数据到本地缓存 RegistryLocalCache
     * 启动维护（定时刷新）本地缓存的轮训任务
     */
    void init();
}
