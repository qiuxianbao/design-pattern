package cn.thinkinjava.design.pattern.create.singleton.frame;

/**
 * 静态内部类
 *
 * @authoro qiuxb
 * @date 2021/8/19
 */
public class InnerClassSingleton {

    static class InnerClass {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    private InnerClassSingleton() {
    }

}
