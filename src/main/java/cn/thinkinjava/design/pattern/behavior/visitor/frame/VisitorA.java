package cn.thinkinjava.design.pattern.behavior.visitor.frame;

/**
 * 具体访问者
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class VisitorA implements Visitor{

    @Override
    public void visit(NodeA node) {
        System.out.println("VisitorA visit NodeA");
        node.operationA();
    }

    @Override
    public void visit(NodeB node) {
        System.out.println("VisitorA visit NodeB");
        node.operationB();
    }
}
