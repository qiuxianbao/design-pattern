package cn.thinkinjava.design.pattern.create.builder.frame;

/**
 * 具体建造者角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteBuilder extends Builder{
    private Product product = new Product();

    @Override
    public void buildPart1() {

    }

    @Override
    public void buildPart2() {

    }

    @Override
    public Product retrieveResult() {
        return this.product;
    }
}
