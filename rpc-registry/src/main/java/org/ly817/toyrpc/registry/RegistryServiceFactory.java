package org.ly817.toyrpc.registry;

import org.ly817.toyrpc.common.config.RpcProperties;
import org.ly817.toyrpc.registry.impl.DirectRegistryService;

/**
 * @author LY
 * @date 2021/10/30 11:06
 * <p>
 * Description:
 * 单例获取
 *
 * 根据配置创建注册发现api
 *
 */
public class RegistryServiceFactory {

    private static volatile RegistryService registryService;

    /**
     *
     * @param rpcProperties
     * @return
     * @throws Exception
     */
    public static RegistryService getInstance(RpcProperties rpcProperties) {
        if (null == registryService) {
            synchronized (RegistryServiceFactory.class) {
                if (null == registryService) {
                    switch (RegistryType.valueOf(rpcProperties.getRegistryType())) {
                        case ZOOKEEPER:

                            break;
                        case REDIS:

                            break;
                        case NACOS:

                            break;
                        case DIRECT:
                            registryService = new DirectRegistryService();
                            break;
                    }
                }
            }
        }
        return registryService;
    }

}
