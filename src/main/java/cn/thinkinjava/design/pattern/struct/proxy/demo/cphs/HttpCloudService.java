package cn.thinkinjava.design.pattern.struct.proxy.demo.cphs;

import cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.annotation.CustomFeignClient;
import cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.annotation.CustomRequestMapping;

/**
 * 动态代理（自定义feign）
 * 比起工具类，可以少写一个接口的实现
 *
 * @author qiuxianbao
 * @date 2024/01/11
 */
@CustomFeignClient
public interface HttpCloudService {

    @CustomRequestMapping(path = "/test1", addToken = true)
    Object test1(String param);

    @CustomRequestMapping(path = "/test2", addToken = false, returnClazz = String.class)
    Object test2(String param);
}
