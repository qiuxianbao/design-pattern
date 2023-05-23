package cn.thinkinjava.design.pattern.create.singleton.frame;

import cn.thinkinjava.design.pattern.create.singleton.frame.LazySingleton;

/**
 * 单例
 *
 * @authoro qiuxb
 * @date 2021/8/19
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton instance = LazySingleton.getInstance();
                // cn.thinkinjava.designpattern.LazySingleton@5abea0a2
                System.out.println(instance);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton instance = LazySingleton.getInstance();
                // cn.thinkinjava.designpattern.LazySingleton@3555b188
                System.out.println(instance);
            }
        }).start();
    }
}
