package cn.thinkinjava.design.pattern.create.singleton.frame;

/**
 * 枚举单例
 *
 * @authoro qiuxb
 * @date 2021/8/19
 */
public enum EnumSingleton {

    /**
     * 实例
     */
    INSTANCE;

    public void print() {
        System.out.println(this.hashCode());
    }
}
