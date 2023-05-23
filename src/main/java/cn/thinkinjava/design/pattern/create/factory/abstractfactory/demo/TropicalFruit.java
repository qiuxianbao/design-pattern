package cn.thinkinjava.design.pattern.create.factory.abstractfactory.demo;

/**
 * 说明：热带水果
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class TropicalFruit implements Fruit{

    private String name;

    public TropicalFruit(String name) {
        System.out.println("TropicalFruit has been factory, name is " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
