package cn.thinkinjava.design.pattern.create.factory.abstractfactory.demo;

/**
 * 说明：北方蔬菜
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class NorthernVeggie implements Veggie{

    private String name;

    public NorthernVeggie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
