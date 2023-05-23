package cn.thinkinjava.design.pattern.behavior.visitor.demo;

/**
 * 访问者
 * @author qiuxianbao
 * @since 1.0.0
 */
public interface Visitor {
    void visit(Engineer engineer);
    void visit(Manager manager);
}
