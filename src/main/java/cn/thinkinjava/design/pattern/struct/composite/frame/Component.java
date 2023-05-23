package cn.thinkinjava.design.pattern.struct.composite.frame;

/**
 * 抽象构件角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public interface Component {
    void sampleOperation();
    Component component();
}
