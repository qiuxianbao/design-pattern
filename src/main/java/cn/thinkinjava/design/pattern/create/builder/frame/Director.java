package cn.thinkinjava.design.pattern.create.builder.frame;

/**
 * 导演角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Director {
    private Builder builder;

    public void construct() {
        builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
        Product product = builder.retrieveResult();
    }
}

