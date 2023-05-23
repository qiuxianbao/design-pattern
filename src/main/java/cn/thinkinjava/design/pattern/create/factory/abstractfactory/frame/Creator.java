package cn.thinkinjava.design.pattern.create.factory.abstractfactory.frame;

/**
 * 工厂接口角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public interface Creator {
    ProductA factoryA();
    ProductB factoryB();
}
