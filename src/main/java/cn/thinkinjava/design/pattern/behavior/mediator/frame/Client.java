package cn.thinkinjava.design.pattern.behavior.mediator.frame;

/**
 * 客户端
 * @author qiuxianbao
 * @date : 2023/1/11
 */
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();

        Colleague1 c1 = new Colleague1(mediator);
//        Colleague2 c2 = new Colleague2(mediator);
        // TODO-QIU: 2023/1/11 c1没有起作用
        mediator.colleagueChanged(c1);
    }

}
