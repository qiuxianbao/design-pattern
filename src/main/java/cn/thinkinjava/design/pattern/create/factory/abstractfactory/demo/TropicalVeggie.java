package cn.thinkinjava.design.pattern.create.factory.abstractfactory.demo;

/**
 * 说明：热带蔬菜
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class TropicalVeggie implements Veggie{

    private String name;

    public TropicalVeggie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
