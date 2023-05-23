package cn.thinkinjava.design.pattern.create.factory.factorymethod.demo;

/**
 * 说明：苹果
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class Apple implements Fruit {

    private int treeAge;

    @Override
    public void grow() {
        System.out.println("Apple is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Apple has been harvested");
    }

    @Override
    public void plant() {
        System.out.println("Apple has been planted");
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
