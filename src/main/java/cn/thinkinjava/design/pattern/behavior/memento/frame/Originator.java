package cn.thinkinjava.design.pattern.behavior.memento.frame;

/**
 * 发起人角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
