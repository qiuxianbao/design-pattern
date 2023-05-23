package cn.thinkinjava.design.pattern.struct.decorator.frame;

/**
 * 具体装饰者
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteDecorator extends Decorator{

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        // 以下为扩充功能
    }
}
