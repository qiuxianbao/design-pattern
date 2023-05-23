package cn.thinkinjava.design.pattern.create.factory.factorymethod.demo;

/**
 * 说明：苹果园丁
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class AppleGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Apple();
    }
}
