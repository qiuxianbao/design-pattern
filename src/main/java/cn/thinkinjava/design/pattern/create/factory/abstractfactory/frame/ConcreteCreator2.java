package cn.thinkinjava.design.pattern.create.factory.abstractfactory.frame;

/**
 * 具体工厂2
 * 生产产品A2和产品B2
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteCreator2 implements Creator {

    @Override
    public ProductA factoryA() {
        return new ProductA2();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB2();
    }
}
