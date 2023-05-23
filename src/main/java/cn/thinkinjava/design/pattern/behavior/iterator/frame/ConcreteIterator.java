package cn.thinkinjava.design.pattern.behavior.iterator.frame;

/**
 * 具体迭代器
 * @author qiuxianbao
 * @date : 2023/1/13
 */
public class ConcreteIterator implements Iterator{
    private ConcreteAggregation agg;
    private int index, size;

    public ConcreteIterator(ConcreteAggregation agg) {
        this.agg = agg;
        this.index = 0;
        this.size = agg.size();
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < size) {
            index++;
        }
    }

    @Override
    public boolean done() {
        return index >= size;
    }

    @Override
    public Object currentItem() {
        return agg.getElement(index);
    }

}
