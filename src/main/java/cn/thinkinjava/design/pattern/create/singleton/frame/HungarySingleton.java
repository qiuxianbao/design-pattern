package cn.thinkinjava.design.pattern.create.singleton.frame;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉模式
 *
 * @authoro qiuxb
 * @date 2021/8/19
 */
public class HungarySingleton implements Serializable {

    private static final long serialVersionUID = -7319509894001667175L;

    private static final HungarySingleton instance = new HungarySingleton();

    public static HungarySingleton getInstance() {
        return instance;
    }

    Object readResolve() throws ObjectStreamException {
        return instance;
    }

    private HungarySingleton() {
    }
}

//public class HungarySingleton {
//
//    private static final HungarySingleton instance = new HungarySingleton();
//
//    public static HungarySingleton getInstance() {
//        return instance;
//    }
//
//    private HungarySingleton() {
//    }
//}
