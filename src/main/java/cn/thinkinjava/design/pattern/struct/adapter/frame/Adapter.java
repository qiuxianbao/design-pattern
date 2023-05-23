package cn.thinkinjava.design.pattern.struct.adapter.frame;

/**
 * 适配器角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {

    }
}
