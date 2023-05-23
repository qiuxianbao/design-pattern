package cn.thinkinjava.design.pattern.behavior.memento.frame;

/**
 * 负责人角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Caretaker {

    private Memento memento;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento retrieveMemento() {
        return memento;
    }

}
