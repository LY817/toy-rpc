package org.ly817.toyrpc.common.rpc;

import java.io.Serializable;

/**
 * @author LY
 * @date 2021/10/24 20:53
 * <p>
 * Description:
 * 响应对象
 */
public class RpcResponse implements Serializable {
    private Object data;
    private String message;
}
