package cn.thinkinjava.design.pattern.behavior.visitor.frame;

/**
 * 访问者接口角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public interface Visitor {
    void visit(NodeA node);
    void visit(NodeB node);
}
