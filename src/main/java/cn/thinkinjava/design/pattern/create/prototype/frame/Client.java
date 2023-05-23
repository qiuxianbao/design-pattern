package cn.thinkinjava.design.pattern.create.prototype.frame;

/**
 * 客户端
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Client {

    public static void main(String[] args) {
        Prototype p = new ConcretePrototype();
        System.out.println(p);

        Prototype clone = p.clone();
        System.out.println(clone);

        // false
        System.out.println(p == clone);
    }
}

