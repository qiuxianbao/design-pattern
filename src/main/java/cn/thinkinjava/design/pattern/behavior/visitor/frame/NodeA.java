package cn.thinkinjava.design.pattern.behavior.visitor.frame;

/**
 * 具体结点角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class NodeA extends Node{

    @Override
    public void accept(Visitor visitor) {
        System.out.println("NodeA accept");
        visitor.visit(this);
    }

    public void operationA() {
        System.out.println("NodeA operationA");
    }

}
