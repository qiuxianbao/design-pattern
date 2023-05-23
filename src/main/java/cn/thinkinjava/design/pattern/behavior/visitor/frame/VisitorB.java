package cn.thinkinjava.design.pattern.behavior.visitor.frame;

/**
 * 具体访问者
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class VisitorB implements Visitor{

    @Override
    public void visit(NodeA node) {
        System.out.println("VisitorB visit NodeA");
        node.operationA();
    }

    @Override
    public void visit(NodeB node) {
        System.out.println("VisitorB visit VisitorB");
        node.operationB();
    }
}
