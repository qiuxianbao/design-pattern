package cn.thinkinjava.design.pattern.struct.decorator.frame;

/**
 * 装饰者角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Decorator implements Component {
    private Component component;

    // 如果没有空参构造，子类就必须要实现了有参构造
    public Decorator() {
    }

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
