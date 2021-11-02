package org.ly817.toyrpc.provider;

import org.ly817.toyrpc.common.config.RpcProperties;
import org.ly817.toyrpc.registry.RegistryServiceFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author LY
 * @date 2021/10/29 21:59
 * <p>
 * Description:
 * 自动注入
 * EnableConfigurationProperties和ConfigurationProperties 成对出现
 *
 */
@Configuration
@EnableConfigurationProperties(RpcProperties.class)
public class RpcProviderAutoConfiguration {

    @Resource
    RpcProperties rpcProperties;

    @Bean
    public RpcServiceProvider rpcServiceProvider() {
        // todo 创建注册中心实例
        return new RpcServiceProvider(rpcProperties.getServicePort(),
                                      RegistryServiceFactory.getInstance(rpcProperties));
    }
}
