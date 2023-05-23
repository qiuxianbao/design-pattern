package cn.thinkinjava.design.pattern.behavior.iterator.frame;

/**
 * 客户端
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Client {
    public static void main(String[] args) {
        Iterator iterator = new ConcreteAggregation().createIterator();
        while (!iterator.done()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
