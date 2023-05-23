package cn.thinkinjava.design.pattern.create.factory.abstractfactory.demo;

/**
 * 说明：北方水果
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class NorthernFruit implements Fruit{

    private String name;

    public NorthernFruit(String name) {
        System.out.println("NorthernFruit has been factory, name is " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
