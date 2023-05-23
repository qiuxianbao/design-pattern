package cn.thinkinjava.design.pattern.behavior.mediator.frame;

/**
 * @author qiuxianbao
 * @date : 2023/1/11
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator m) {
        this.mediator = m;
    }

    public abstract void action();

    public void change() {
        mediator.colleagueChanged(this);
    }

    public Mediator getMediator() {
        return mediator;
    }
}
