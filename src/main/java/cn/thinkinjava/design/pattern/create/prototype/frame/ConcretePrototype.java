package cn.thinkinjava.design.pattern.create.prototype.frame;

/**
 * 具体原型实现
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcretePrototype implements Prototype {

    @Override
    public Prototype clone() {
        try {
            // Object#clone()
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
