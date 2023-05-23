package cn.thinkinjava.design.pattern.create.prototype.frame;

/**
 * 原型接口
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public interface Prototype extends Cloneable{
    Prototype clone();
}
