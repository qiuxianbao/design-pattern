package cn.thinkinjava.design.pattern.create.factory.factorymethod.demo;

/**
 * 说明：水果
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public interface Fruit {

    /**
     * 生长
     */
    void grow();

    /**
     * 收获
     */
    void harvest();

    /**
     * 种植
     */
    void plant();
}
