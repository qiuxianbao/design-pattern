package cn.thinkinjava.design.pattern.behavior.state.frame;

/**
 * 环境角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Context {
    private State state;

    public void sampleOperation() {
        state.sampleOperation();
    }

    public void setState(State state) {
        this.state = state;
    }
}
