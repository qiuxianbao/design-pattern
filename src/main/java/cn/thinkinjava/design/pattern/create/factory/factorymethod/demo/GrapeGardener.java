package cn.thinkinjava.design.pattern.create.factory.factorymethod.demo;



/**
 * 说明：葡萄园丁
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class GrapeGardener implements FruitGardener {

    @Override
    public Fruit factory() {
        return new Grape();
    }
}
