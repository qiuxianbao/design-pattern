package cn.thinkinjava.design.pattern.create.builder.frame;

/**
 * 抽象建造者角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public abstract class Builder {
    abstract public void buildPart1();

    abstract public void buildPart2();

    abstract public Product retrieveResult();
}
