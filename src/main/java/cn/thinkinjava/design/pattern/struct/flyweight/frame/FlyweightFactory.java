package cn.thinkinjava.design.pattern.struct.flyweight.frame;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 享元工厂
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class FlyweightFactory {

    private Map<Character, Flyweight> cache = new HashMap<>();

    public Flyweight factory(Character intrinsicState) {
        Flyweight fly = cache.get(intrinsicState);
        if (fly == null) {
            fly = new ConcreteFlyweight(intrinsicState);
            cache.put(intrinsicState, fly);
        }
        return fly;
    }

    public void checkFlyweight() {
        int i = 0;
        for (Iterator it = cache.entrySet().iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(String.format("Item%s: key is %s", i++, entry.getKey()));
        }
    }

}
