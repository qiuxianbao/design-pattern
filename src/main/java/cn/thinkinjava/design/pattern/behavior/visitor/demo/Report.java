package cn.thinkinjava.design.pattern.behavior.visitor.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 报表
 * @author qiuxianbao
 * @since 1.0.0
 */
public class Report {
    private List<Staff> staffList = new ArrayList<>();

    public Report() {
        staffList.add(new Engineer("engineer-1"));
        staffList.add(new Manager("manager-1"));
        staffList.add(new Engineer("engineer-2"));
        staffList.add(new Manager("manager-2"));
        staffList.add(new Manager("manager-3"));
    }

    public void show(Visitor visitor) {
        for (Staff s : staffList) {
            s.accept(visitor);
        }
    }

}
