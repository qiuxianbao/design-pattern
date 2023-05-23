package cn.thinkinjava.design.pattern.behavior.visitor.demo;

/**
 * @author qiuxianbao
 * @since 1.0.0
 */
public class CTOVisitor implements Visitor{

    @Override
    public void visit(Engineer engineer) {
        System.out.println(engineer.name + ", " + engineer.kpi + ", cto other");
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(manager.name + ", " + manager.kpi + ", cto other");
    }
}
