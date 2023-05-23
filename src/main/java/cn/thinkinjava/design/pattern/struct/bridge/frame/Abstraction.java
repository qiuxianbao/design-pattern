package cn.thinkinjava.design.pattern.struct.bridge.frame;

/**
 * 抽象化角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public abstract class Abstraction {
    protected Implementor impl;

    public void operation() {
        impl.operationImpl();
    }
}
