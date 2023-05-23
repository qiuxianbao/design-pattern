package cn.thinkinjava.design.pattern.create.factory.factorymethod.frame;

/**
 * 具体工厂
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteCreator1 implements Creator {
    @Override
    public Product factory() {
        return new ConcreteProduct1();
    }
}
