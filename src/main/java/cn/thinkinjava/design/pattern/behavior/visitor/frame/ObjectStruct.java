package cn.thinkinjava.design.pattern.behavior.visitor.frame;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 结点对象角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ObjectStruct {
    private Vector<Node> nodes;

    public ObjectStruct() {
        this.nodes = new Vector<>();
    }

    public void action(Visitor visitor) {
        Enumeration<Node> elements = nodes.elements();
        while (elements.hasMoreElements()) {
            Node node = elements.nextElement();
            node.accept(visitor);
        }
    }

    public void add(Node node) {
        nodes.addElement(node);
    }


}
