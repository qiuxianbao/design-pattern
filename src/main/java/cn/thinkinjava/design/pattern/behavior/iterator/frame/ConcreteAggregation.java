package cn.thinkinjava.design.pattern.behavior.iterator.frame;

/**
 * 具体集合
 *
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteAggregation extends Aggregation{
    private Object[] objects = {"a", "b", "c", "d"};

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size() {
        return objects.length;
    }

    public Object getElement(int index) {
        if (index < objects.length) {
            return objects[index];
        } else {
            return null;
        }
    }
}
