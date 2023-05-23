package cn.thinkinjava.design.pattern.behavior.visitor.demo;

import java.util.Random;

/**
 * 元素
 * @author qiuxianbao
 * @since 1.0.0
 */
public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name) {
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }
    public abstract void accept(Visitor visitor);

}
