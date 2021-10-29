package org.ly817.toyrpc.serialization;

import java.io.IOException;

/**
 * Created by LuoYu on 2021-10-29.
 * 对象与二进制转换接口
 */
public interface RpcSerialization {

    <T> byte[] serialize(T obj) throws IOException;

    <T> T deserialize(byte[] data, Class<T> clz) throws IOException;
}
