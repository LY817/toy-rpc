package org.ly817.toyrpc.protocol;

import lombok.Data;

/**
 * @author LY
 * @date 2021/10/29 17:13
 * <p>
 * Description:
 */
@Data
public class RpcMessageHeader {

    /**
     * 魔数
     */
    private short magic;

    /**
     * 协议版本号
     */
    private byte version;

    /**
     * 序列化算法
     */
    private byte serialization;

    /**
     * 报文类型
     */
    private byte msgType;

    /**
     * 状态
     */
    private byte status;

    /**
     * 消息ID
     */
    private long requestId;

    /**
     * 数据长度
     */
    private int msgLen;
}
