package org.ly817.toyrpc.common.rpc;

import io.netty.util.concurrent.Promise;
import lombok.Data;

/**
 * @author LY
 * @date 2021/10/24 20:55
 * <p>
 * Description:
 * 异步调用
 */
@Data
public class RpcFuture<T> {
    private Promise<T> promise;
    private long timeout;
}
