package cn.thinkinjava.design.pattern.behavior.mediator.frame;

/**
 * @author qiuxianbao
 * @date : 2023/1/11
 */
public class ConcreteMediator extends Mediator{
    private Colleague1 colleague1;
    private Colleague2 colleague2;

    @Override
    public void colleagueChanged(Colleague c) {
        // TODO-QIU: 2023/1/13
        colleague1.action();
        colleague2.action();
    }

    public void createConcreteMediator() {
        this.colleague1 = new Colleague1(this);
        this.colleague2 = new Colleague2(this);
    }

    public Colleague1 getColleague1() {
        return colleague1;
    }

    public Colleague2 getColleague2() {
        return colleague2;
    }
}
