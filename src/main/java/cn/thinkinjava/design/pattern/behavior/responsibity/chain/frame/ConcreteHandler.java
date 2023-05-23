package cn.thinkinjava.design.pattern.behavior.responsibity.chain.frame;

/**
 * 具体处理者
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteHandler extends Handler{

    @Override
    public void handlerRequest() {
        Handler successor = getSuccessor();
        if (successor != null) {
            System.out.println("The request is passed to " + getSuccessor() );
            successor.handlerRequest();
        } else {
            System.out.println( this + " handled request");
        }
    }
}
