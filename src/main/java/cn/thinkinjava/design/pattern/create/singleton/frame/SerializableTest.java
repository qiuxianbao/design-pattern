package cn.thinkinjava.design.pattern.create.singleton.frame;

import java.io.*;

/**
 * 测试Serializable
 *
 * @authoro qiuxb
 * @date 2021/8/19
 */
public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungarySingleton instance = HungarySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instance"));
        oos.writeObject(instance);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("instance"));
        HungarySingleton instance1 = (HungarySingleton) ois.readObject();
        ois.close();
        System.out.println(instance == instance1);
    }
}
