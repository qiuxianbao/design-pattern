package cn.thinkinjava.design.pattern.behavior.observer.frame;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 具体主题
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteSubject implements Subject {
    private Vector<Observer> observers = new Vector<>();

    @Override
    public void attach(Observer observer) {
        observers.addElement(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.removeElement(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> observers = observers();
        while (observers.hasMoreElements()) {
            Observer observer = observers.nextElement();
            observer.update();
        }
    }

    private Enumeration<Observer> observers() {
        return observers.elements();
    }

}
