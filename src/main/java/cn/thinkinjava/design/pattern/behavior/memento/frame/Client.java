package cn.thinkinjava.design.pattern.behavior.memento.frame;

/**
 * 客户端
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("up");
        System.out.println(originator);

        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(originator.createMemento());

        originator.setState("down");
        System.out.println(originator);

        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println(originator);
    }
}
