package org.ly817.toyrpc.registry;

import org.ly817.toyrpc.common.service.ServiceMetadata;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author LY
 * @date 2021/10/30 11:11
 * <p>
 * Description:
 * 定时拉取服务
 * List<ServiceMetadata>的排序可以做点文章
 *
 * 暂时用一个本地map代替
 */
public class RegistryLocalCache {
    private volatile ConcurrentHashMap<String, List<ServiceMetadata>> serviceLocalCache = new ConcurrentHashMap<>();
}
