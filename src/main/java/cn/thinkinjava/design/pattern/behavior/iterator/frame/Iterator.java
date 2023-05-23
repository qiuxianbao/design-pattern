package cn.thinkinjava.design.pattern.behavior.iterator.frame;

/**
 * 迭代器接口角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public interface Iterator {
    void first();
    void next();
    boolean done();
    Object currentItem();
}
