package cn.thinkinjava.design.pattern.struct.flyweight.frame;

/**
 * 具体享元角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteFlyweight extends Flyweight {
    // 内蕴状态
    private Character intrinsicState;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        System.out.println(String.format("intrinsicState is %s, state is %s", intrinsicState, state));
    }
}
