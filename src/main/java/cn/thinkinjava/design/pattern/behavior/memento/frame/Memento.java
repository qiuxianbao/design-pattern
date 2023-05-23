package cn.thinkinjava.design.pattern.behavior.memento.frame;

/**
 * 备忘录角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
