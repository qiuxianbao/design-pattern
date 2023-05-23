package cn.thinkinjava.design.pattern.behavior.responsibity.chain.frame;

/**
 * 抽象处理者角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public abstract class Handler {
    protected Handler successor;

    public abstract void handlerRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
