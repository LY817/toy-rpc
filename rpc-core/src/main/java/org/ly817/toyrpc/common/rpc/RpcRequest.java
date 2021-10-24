package org.ly817.toyrpc.common.rpc;

import lombok.Data;

import java.io.Serializable;

/**
 * @author LY
 * @date 2021/10/24 20:49
 * <p>
 * Description:
 * 请求对象
 */
@Data
public class RpcRequest implements Serializable {
    /**
     * 方法版本号
     */
    private String serviceVersion;

    /**
     * 调用类名
     */
    private String className;

    /**
     * 调用方法名
     */
    private String methodName;

    /**
     * 调用参数
     */
    private Object[] params;

    /**
     * 调用参数的类型
     */
    private Class<?>[] parameterTypes;
}
