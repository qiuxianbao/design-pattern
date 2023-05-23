package cn.thinkinjava.design.pattern.struct.composite.frame;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 树枝结点角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Composite implements Component {

    private Vector<Component> componentVector = new Vector<>();

    @Override
    public void sampleOperation() {
        Enumeration<Component> enumeration = components();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().sampleOperation();
        }
    }

    @Override
    public Component component() {
        return this;
    }

    public void add(Component c) {
        componentVector.add(c);
    }

    public void remove(Component c) {
        componentVector.remove(c);
    }

    public Enumeration<Component> components() {
        return componentVector.elements();
    }

}
