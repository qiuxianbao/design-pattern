package cn.thinkinjava.design.pattern.create.factory.simplefactory.demo;

/**
 * 说明：园丁
 *
 * @author : qiuxb
 * @date : 2022/4/13
 */
public class FruitGardener {

    /**
     * 静态工厂
     * @param witch
     * @return
     */
    public static Fruit factory(String witch) {
        if (witch.equalsIgnoreCase("Apple")) {
            return new Apple();
        } else if (witch.equalsIgnoreCase("Grape")) {
//            return new Grape();
        } else if (witch.equalsIgnoreCase("Strawberry")) {
            return new Strawberry();
        }
        throw new BadFruitException("Bad fruit request");
    }
}
