package cn.thinkinjava.design.pattern.create.factory.abstractfactory.demo;

/**
 * 说明：园丁
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public interface Gardener {

    /**
     * 创建水果
     */
    Fruit factoryFruit(String name);

    /**
     * 创建蔬菜
     */
    Veggie factoryVeggie(String name);
}
