package cn.thinkinjava.design.pattern.create.singleton.frame;

/**
 * 懒汉模式
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class LazySingleton {
    private volatile static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

/*class LazySingleton {

    private static LazySingleton instance;
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    private LazySingleton() {
    }

}*/

/*class LazySingleton {

    private static LazySingleton instance;
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    private LazySingleton() {
    }

}*/

/*class LazySingleton {

    private static LazySingleton instance;
    // 多线程并发，会创建多个示例
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    private LazySingleton() {
    }

}*/