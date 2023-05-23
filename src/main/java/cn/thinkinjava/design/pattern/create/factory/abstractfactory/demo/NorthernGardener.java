package cn.thinkinjava.design.pattern.create.factory.abstractfactory.demo;

/**
 * 说明：北方园丁
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class NorthernGardener implements Gardener {
    @Override
    public Fruit factoryFruit(String name) {
        return new NorthernFruit(name);
    }

    @Override
    public Veggie factoryVeggie(String name) {
        return new NorthernVeggie(name);
    }
}
