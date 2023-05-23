package cn.thinkinjava.design.pattern.behavior.command.frame;

/**
 * 客户端
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
