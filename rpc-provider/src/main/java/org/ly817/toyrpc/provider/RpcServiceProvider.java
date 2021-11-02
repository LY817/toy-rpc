package org.ly817.toyrpc.provider;

import lombok.extern.slf4j.Slf4j;
import org.ly817.toyrpc.common.annotation.RpcService;
import org.ly817.toyrpc.registry.RegistryService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.net.InetAddress;

/**
 * @author LY
 * @date 2021/10/29 19:21
 * <p>
 * Description:
 *
 */
@Slf4j
public class RpcServiceProvider implements InitializingBean, BeanPostProcessor {

    /**
     * 服务IP
     *
     * todo 获取当前实例适当网卡的端口实现
     */
    private String serverAddress;

    /**
     * 服务端口
     */
    private final int serverPort;

    /**
     * 服务注册实现
     */
    private final RegistryService serviceRegistry;

    public RpcServiceProvider(int serverPort,RegistryService serviceRegistry) {
        this.serverPort = serverPort;
        this.serviceRegistry = serviceRegistry;
    }

    /**
     * 启动netty网络服务的入口
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        this.serverAddress = InetAddress.getLocalHost().getHostAddress();
        log.info("test");
        startRpcServer();
    }

    /**
     * 启动netty服务
     * 启动子线程启动netty服务，避免阻塞springboot启动过程
     */
    private void startRpcServer() throws Exception {

    }

    /**
     * 扫描所有注入的bean，
     * 将所有标注的bean作为对外提供服务提供列表
     * @see RpcService
     * 将这些bean服务注册到服务注册中心
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
