package cn.thinkinjava.design.pattern.behavior.responsibity.chain.frame;

/**
 * 客户端
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Client {

    public static void main(String[] args) {
        ConcreteHandler h3 = new ConcreteHandler();

        ConcreteHandler h2 = new ConcreteHandler();
        h2.setSuccessor(h3);

        ConcreteHandler h1 = new ConcreteHandler();
        h1.setSuccessor(h2);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        h1.handlerRequest();
    }
}
