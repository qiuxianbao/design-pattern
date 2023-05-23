package cn.thinkinjava.design.pattern.behavior.visitor.frame;

/**
 * 客户端
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Client {
    public static void main(String[] args) {
        ObjectStruct struct = new ObjectStruct();
        struct.add(new NodeA());
        struct.add(new NodeB());

        struct.action(new VisitorB());
    }
}
