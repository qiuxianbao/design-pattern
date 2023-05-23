package cn.thinkinjava.design.pattern.create.factory.factorymethod.demo;

/**
 * 说明：葡萄
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class Grape implements Fruit {

    private boolean seedless;

    @Override
    public void grow() {
        System.out.println("Grape is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Grape has been harvested");
    }

    @Override
    public void plant() {
        System.out.println("Grape has been planted");
    }

    public boolean isSeedless() {
        return seedless;
    }

    public void setSeedless(boolean seedless) {
        this.seedless = seedless;
    }
}
