package cn.thinkinjava.design.pattern.create.factory.simplefactory.frame;

/**
 * 工厂角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Creator {

    public static Product factory(String type) {
        // type=1, ConcreteProduct1
        // type=2, ConcreteProduct2
        return new ConcreteProduct();
    }
}
