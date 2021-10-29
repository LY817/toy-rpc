package org.ly817.toyrpc.provider;

import lombok.extern.slf4j.Slf4j;
import org.ly817.toyrpc.common.annotation.RpcService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

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
    private final String serverAddress;

    /**
     * 服务端口
     */
    private final int serverPort;

    public RpcServiceProvider(String serverAddress, int serverPort) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
    }

    /**
     * 启动netty网络服务的入口
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {

    }

    /**
     * 启动netty服务
     * @throws Exception
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
