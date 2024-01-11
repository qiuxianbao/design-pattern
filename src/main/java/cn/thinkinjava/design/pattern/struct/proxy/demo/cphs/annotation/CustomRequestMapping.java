package cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.annotation;

import java.lang.annotation.*;

/**
 * @author qiuxianbao
 * @date 2024/01/11
 */
@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomRequestMapping {

    /**
     * http请求方法路径
     */
    String path() default "";

    /**
     * 请求处理类方法返回对象的class类型
     */
    Class returnClazz() default Object.class;

    /**
     * 校验token参数
     */
    boolean addToken() default true;

    /**
     * 校验请求参数签名
     *
     * @return
     */
    boolean addSign() default true;
}
