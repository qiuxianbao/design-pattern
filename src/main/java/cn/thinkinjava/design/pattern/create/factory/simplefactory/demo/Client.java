package cn.thinkinjava.design.pattern.create.factory.simplefactory.demo;

/**
 * 说明：客户端
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class Client {

    public static void main(String[] args) {
        Fruit apple = FruitGardener.factory("Apple");
        apple.grow();
    }
}
