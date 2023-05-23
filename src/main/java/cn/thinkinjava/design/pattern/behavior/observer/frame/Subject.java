package cn.thinkinjava.design.pattern.behavior.observer.frame;

/**
 * 主题接口角色
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
