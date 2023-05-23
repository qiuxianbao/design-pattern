package cn.thinkinjava.design.pattern.behavior.template.frame;

/**
 * 抽象模板角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public abstract class AbstractClass {

    public void templateMethod() {
        doOperation1();
        doOperation2();
        doOperation3();
    }

    protected abstract void doOperation1();

    protected abstract void doOperation2();


    private final void doOperation3() {
        // 已经实现，不需要子类实现，以及继承
    }

}
