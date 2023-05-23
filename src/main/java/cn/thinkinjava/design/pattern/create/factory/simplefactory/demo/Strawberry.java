package cn.thinkinjava.design.pattern.create.factory.simplefactory.demo;

/**
 * 说明：草莓
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class Strawberry implements Fruit {

    @Override
    public void grow() {
        System.out.println("Strawberry is growing");
    }

    @Override
    public void harvest() {
        System.out.println("Strawberry has been harvested");
    }

    @Override
    public void plant() {
        System.out.println("Strawberry has been planted");
    }
}
