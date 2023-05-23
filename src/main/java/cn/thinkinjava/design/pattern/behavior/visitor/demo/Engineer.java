package cn.thinkinjava.design.pattern.behavior.visitor.demo;

/**
 * 元素实现类
 * @author qiuxianbao
 * @since 1.0.0
 */
public class Engineer extends Staff{

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
