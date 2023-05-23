
写在前面
=========================
说起设计模式，大家多多少少都有所了解，但是，能够烂熟于心并恰当地运用到实际项目当中的估计不多。`基于学习的四个过程：记忆、理解、表达和融汇贯通`，本项目结合`《Java与模式》`，通过plantuml画图的方式，用于加深对设计模式的记忆和理解。

关于如何看plantuml类图，请参见历史文章[【UML】- 类图](https://blog.csdn.net/u010773514/article/details/124796460)，更多请参见[CSDN博文](https://blog.csdn.net/u010773514)。

Java 23种设计模式
=========================
记忆方式：按类型，记忆原则、设计模式的第一个字
- 原则（6）：`单`（单一职责）、`依`（依赖倒置）、`里`（里氏代换）、`接`（接口隔离）、`最`（最少知道）、`开`（开闭原则）
- 创建型（5）：`工`（简单工厂）、`抽`（抽象工厂）、`单`（单例）、`建`（建造者）、`原`（原型）
- 结构型（7）：`外`（外观）、`代`（代理）、`装`（装饰者）、`适`（适配器）、`桥`（桥接）、`组`（组合）、`享`（享元）
- 行为型（11）：`策`（策略）、`模`（模板）、`观`（观察者）、`迭`（迭代器）、`责`（责任链）、`命`（命令者）、`备`（备忘录）、`状`（状态）、`访`（访问者）、`中`（中介者）、`解`（解释器）

- [ ] 关于设计模式及其注意事项，这部分内容会在后续文章中补充

项目结构
=========================
以下简单说明一下项目的结构。每种设计模式下都会有2个包，一个是frame（用于编写设计plantuml对应的代码），一个是demo（用于编写示例），具体的plantuml类图代码会放在resource下面。

```
├─doc
│  ├─behavior
│  ├─create
│  └─struct
└─src
    ├─main
    │  ├─java
    │  │  └─cn
    │  │      └─thinkinjava
    │  │          └─design
    │  │              └─pattern
    │  │                  ├─behavior //行为型
    │  │                  │  ├─command // 命令者
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─interpreter //解释器
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─iterator //迭代器
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─mediator //中介者
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─memento //备忘录
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─observer //观察者
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─responsibity
    │  │                  │  │  └─chain //责任链
    │  │                  │  │      ├─demo
    │  │                  │  │      └─frame
    │  │                  │  ├─state //状态
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─strategy //策略
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─template //模板
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  └─visitor //访问者
    │  │                  │      ├─demo
    │  │                  │      └─frame
    │  │                  ├─create //创建型
    │  │                  │  ├─builder //建造者
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  ├─factory //工厂
    │  │                  │  │  ├─abstractfactory //抽象工厂
    │  │                  │  │  │  ├─demo
    │  │                  │  │  │  └─frame
    │  │                  │  │  ├─factorymethod //工厂方法
    │  │                  │  │  │  ├─demo
    │  │                  │  │  │  └─frame
    │  │                  │  │  └─simplefactory //简单工厂
    │  │                  │  │      ├─demo
    │  │                  │  │      └─frame
    │  │                  │  ├─prototype //原型
    │  │                  │  │  ├─demo
    │  │                  │  │  └─frame
    │  │                  │  └─singleton //单例
    │  │                  │      ├─demo
    │  │                  │      └─frame
    │  │                  └─struct //结构型
    │  │                      ├─adapter //适配器
    │  │                      │  ├─demo
    │  │                      │  └─frame
    │  │                      ├─bridge //桥接
    │  │                      │  ├─demo
    │  │                      │  └─frame
    │  │                      ├─composite //组合
    │  │                      │  ├─demo
    │  │                      │  └─frame
    │  │                      ├─decorator //装饰者
    │  │                      │  ├─demo
    │  │                      │  └─frame
    │  │                      ├─facde //外观（门面）
    │  │                      │  ├─demo
    │  │                      │  └─frame
    │  │                      ├─flyweight //享元
    │  │                      │  ├─demo
    │  │                      │  └─frame
    │  │                      └─proxy //代理
    │  │                          ├─demo
    │  │                          └─frame
    │  └─resources //*.uml, uml类图位置
    │      ├─behavior //行为型
    │      ├─create //创建型
    │      └─struct //结构型
    └─test
        └─java
```

写在后面
=========================
如果本项目内容对您有价值或者有启发的话，欢迎点赞、fork、评论。如果您有一些疑问，欢迎探讨、批评指正。
