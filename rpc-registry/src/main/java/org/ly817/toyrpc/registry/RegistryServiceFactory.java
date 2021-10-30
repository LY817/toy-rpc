package org.ly817.toyrpc.registry;

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

    public static RegistryService getInstance(String registryAddr, RegistryType type) throws Exception {

        if (null == registryService) {
            synchronized (RegistryServiceFactory.class) {
                if (null == registryService) {
                    switch (type) {
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
