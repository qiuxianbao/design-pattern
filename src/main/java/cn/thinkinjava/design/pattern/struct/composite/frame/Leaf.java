package cn.thinkinjava.design.pattern.struct.composite.frame;

/**
 * 树叶结点构件角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Leaf implements Component{

    @Override
    public void sampleOperation() {

    }

    @Override
    public Component component() {
        return this;
    }
}
