package cn.thinkinjava.design.pattern.behavior.command.frame;

/**
 * 命令调用者
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
