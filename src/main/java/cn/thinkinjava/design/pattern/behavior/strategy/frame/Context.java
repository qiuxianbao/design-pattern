package cn.thinkinjava.design.pattern.behavior.strategy.frame;

/**
 * 环境角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Context {
    private Strategy strategy;

    public void contextInterface() {
        strategy.strategyInterface();
    }
}
