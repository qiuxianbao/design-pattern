package cn.thinkinjava.design.pattern.create.factory.factorymethod.demo;

/**
 * 说明：异常
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class BadFruitException extends RuntimeException {

    public BadFruitException() {
    }

    public BadFruitException(String message) {
        super(message);
    }
}
