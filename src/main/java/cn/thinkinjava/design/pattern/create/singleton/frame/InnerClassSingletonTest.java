package cn.thinkinjava.design.pattern.create.singleton.frame;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * TODO:
 *
 * @authoro qiuxb
 * @date 2021/8/19
 */
public class InnerClassSingletonTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();
        InnerClassSingleton instance = InnerClassSingleton.getInstance();

        // false
        System.out.println(innerClassSingleton == instance);
    }
}
