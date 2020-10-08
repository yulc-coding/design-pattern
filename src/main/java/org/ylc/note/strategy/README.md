## 策略模式

![](https://github.com/yulc-coding/design-pattern/tree/master/src/main/java/org/ylc/note/strategy/UML_strategy.png)

* `AbstractStrategy`：定义一个抽象策略类；
* 创建具体的实现继承这个抽象类；
* `Context`：初始化指定的策略类，调用其方法