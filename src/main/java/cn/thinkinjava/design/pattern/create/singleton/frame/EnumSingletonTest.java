package cn.thinkinjava.design.pattern.create.singleton.frame;

/**
 * @authoro qiuxb
 * @date 2021/8/19
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance1 = EnumSingleton.INSTANCE;

        // true
        System.out.println(instance == instance1);
        // 780237624
        instance.print();
        // 780237624
        instance1.print();
    }
}
