package cn.thinkinjava.design.pattern.behavior.command.frame;

/**
 * 具体命令实现
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteCommand implements Command{
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
