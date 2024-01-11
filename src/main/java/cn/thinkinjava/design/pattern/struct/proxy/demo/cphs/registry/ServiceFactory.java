package cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.registry;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author qiuxianbao
 * @date 2024/01/10
 */
public class ServiceFactory<T> implements FactoryBean<T> {

    private Class<T> interfaceType;

    public ServiceFactory(Class<T> interfaceType) {
        this.interfaceType = interfaceType;
    }

    @Override
    public T getObject() throws Exception {
        InvocationHandler handler = new ServiceProxy();
        return (T) Proxy.newProxyInstance(interfaceType.getClassLoader(),new Class[]{interfaceType}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return interfaceType;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
