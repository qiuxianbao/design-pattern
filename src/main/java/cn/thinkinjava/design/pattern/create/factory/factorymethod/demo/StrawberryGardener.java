package cn.thinkinjava.design.pattern.create.factory.factorymethod.demo;


/**
 * 说明：草莓园丁
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class StrawberryGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Strawberry();
    }
}
