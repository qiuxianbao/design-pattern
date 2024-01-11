package cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.registry;



import cn.thinkinjava.design.pattern.struct.proxy.demo.cphs.annotation.CustomRequestMapping;
import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author qiuxianbao
 * @date 2024/01/11
 */
@Data
public class ServiceProxy implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        CustomRequestMapping customAnnotation = method.getAnnotation(CustomRequestMapping.class);
        String path = customAnnotation.path();
        Class returnClazz = customAnnotation.returnClazz();
        boolean addToken = customAnnotation.addToken();
        boolean addSign = customAnnotation.addSign();
        Object obj = args[0];
        String body = JSON.toJSONString(obj);
        return sendRequest(body, path, addToken, addSign, returnClazz, true);
    }

    private Object sendRequest(String body, String path, boolean addToken, boolean addSign, Class returnClazz, boolean b) {
        StringBuilder builder = new StringBuilder();
        builder.append("path is ").append(path);
        builder.append(" | addToken is ").append(addToken);
        builder.append(" | body is ").append(body);
        return builder.toString();
    }

}
