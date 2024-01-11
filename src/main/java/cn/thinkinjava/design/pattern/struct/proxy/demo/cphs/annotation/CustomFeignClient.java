package cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解，封装http客户端请求
 *
 * @author qiuxianbao
 * @date 2024/01/10
 */
@Target(value={ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomFeignClient {

    /**
     * http所有业务请求参数的签名
     * 签名方式为
     * 是否校验签名，默认需要：true
     */
    boolean checkSign() default true;

    /**
     * 指定接口是否需要token校验才能访问，默认需要
     */
    boolean checkToken() default true;

    /**
     * 请求参数Class类型
     */
    Class[] paramClazz() default {};
}
