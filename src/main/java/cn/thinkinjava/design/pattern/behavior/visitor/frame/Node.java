package cn.thinkinjava.design.pattern.behavior.visitor.frame;

/**
 * 抽象结点角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public abstract class Node {
    public abstract void accept(Visitor visitor);
}
