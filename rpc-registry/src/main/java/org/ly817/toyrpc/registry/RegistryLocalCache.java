package org.ly817.toyrpc.registry;

import org.ly817.toyrpc.common.service.ServiceMetadata;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author LY
 * @date 2021/10/30 11:11
 * <p>
 * Description:
 * 定时拉取服务
 * 负载均衡List<ServiceMetadata>的排序可以做点文章
 *
 * 暂时用一个本地map代替
 *
 * 数据结构封装
 */
public class RegistryLocalCache {

    /**
     * 全部在线服务的本地缓存
     */
    private volatile ConcurrentHashMap<String, List<ServiceMetadata>> localCache = new ConcurrentHashMap<>();

    public RegistryLocalCache() {
    }

    public RegistryLocalCache(Map<String, List<ServiceMetadata>> services) {
        localCache.putAll(services);
    }

    /**
     *
     * @param key
     * @param index 与当前服务列表的长度取模
     * @return
     */
    public ServiceMetadata get(String key,int index) {
        List<ServiceMetadata> serviceMetadataList = localCache.get(key);
        if (serviceMetadataList == null) {
            // 无服务
            throw new RuntimeException("no" + key + " service registered!");
        }
        return serviceMetadataList.get(index % serviceMetadataList.size());
    }

    /**
     * 添加服务到本地缓存
     * @param key
     * @param serviceMetadata
     */
    public void put(String key,ServiceMetadata serviceMetadata) {
        List<ServiceMetadata> serviceMetadataList = localCache.get(key);
        if (serviceMetadata == null) {
            serviceMetadataList = new LinkedList<>();
        }
        serviceMetadataList.add(serviceMetadata);
    }

    /**
     * 剔除服务
     * @param key
     * @param serviceMetadata
     */
    public void delete(String key,ServiceMetadata serviceMetadata) {
        List<ServiceMetadata> serviceMetadataList = localCache.get(key);
        if (serviceMetadata == null) {
            serviceMetadataList = new LinkedList<>();
        }
        serviceMetadataList.remove(serviceMetadata);
    }
}
