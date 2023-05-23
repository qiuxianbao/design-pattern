package cn.thinkinjava.design.pattern.create.factory.abstractfactory.demo;

/**
 * 说明：热带园丁
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class TropicalGardener implements Gardener {
    @Override
    public Fruit factoryFruit(String name) {
        return new TropicalFruit(name);
    }

    @Override
    public Veggie factoryVeggie(String name) {
        return new TropicalVeggie(name);
    }
}
