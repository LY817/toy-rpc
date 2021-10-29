package org.ly817.toyrpc.common.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 将类标记为服务提供者的方法
 * 并且将这个类标记为Spring组件
 *
 * 标记接口定义interface或者其实现类
 *
 * @author LuoYu
 * @date 2021-10-29
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface RpcService {

    String serviceVersion() default "1.0";
}
