## 策略模式

> 定义了一系列算法，每种算法都执行相同的工作，只是实现不同，减少了各类算法和调用者的耦合度。策略模式中每个算法都有自己单独的类，可以简化单元测试。

* `AbstractStrategy`：定义一个抽象策略类；
* 创建具体的实现继承这个抽象类；
* `Context`：初始化指定的策略类，调用其方法

![](https://github.com/yulc-coding/design-pattern/blob/master/src/main/java/org/ylc/note/strategy/UML_strategy.png)
