package cn.thinkinjava.design.pattern.behavior.mediator.frame;

/**
 * @author qiuxianbao
 * @date : 2023/1/11
 */
public class Colleague2 extends Colleague{

    public Colleague2(Mediator m) {
        super(m);
    }

    @Override
    public void action() {
        System.out.println("action from Colleague2");
    }
}
