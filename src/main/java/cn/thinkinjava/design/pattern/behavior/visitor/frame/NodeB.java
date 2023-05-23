package cn.thinkinjava.design.pattern.behavior.visitor.frame;

/**
 * 具体结点角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class NodeB extends Node{

    @Override
    public void accept(Visitor visitor) {
        System.out.println("NodeB accept");
        visitor.visit(this);
    }

    public void operationB() {
        System.out.println("NodeB operationB");
    }
}
