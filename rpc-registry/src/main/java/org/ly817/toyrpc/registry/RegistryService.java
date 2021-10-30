package org.ly817.toyrpc.registry;

import org.ly817.toyrpc.common.service.ServiceMetadata;

import java.io.IOException;

/**
 * 注册中心操作接口
 * @author LuoYu
 * @date 2021-10-30
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
     * @param serviceName
     * @param invokerHashCode
     * @return
     * @throws Exception
     */
    ServiceMetadata discovery(String serviceName, int invokerHashCode) throws Exception;


    void destroy() throws IOException;
}
