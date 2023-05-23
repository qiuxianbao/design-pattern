package cn.thinkinjava.design.pattern.create.factory.abstractfactory.frame;

/**
 * 具体工厂1
 * 生产产品A1和产品B1
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteCreator1 implements Creator {

    @Override
    public ProductA factoryA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryB() {
        return new ProductB1();
    }
}
