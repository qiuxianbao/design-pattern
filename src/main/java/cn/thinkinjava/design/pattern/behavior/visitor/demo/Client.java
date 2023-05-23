package cn.thinkinjava.design.pattern.behavior.visitor.demo;

/**
 * 访问者模式
 * 让访问者来访问元素，具体不同放在访问者处
 *
 * 角色：元素接口/抽象类（accept）、元素实现类、元素集合
 * 访问者(visit)、访问者实现类
 *
 * 场景：报表
 *
 * @author qiuxianbao
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {
        Report report = new Report();
        System.out.println("====CEO====");
        report.show(new CEOVisitor());
        System.out.println("====CTO====");
        report.show(new CTOVisitor());
        // 变体
        Staff s = new Engineer("engineer");
        s.accept(new CTOVisitor());
    }

}
