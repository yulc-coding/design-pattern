## 观察者模式

当一个操作执行后，需要同时改变多个其他的操作

* `AbstractObserver`抽象的观察者类，定义了观察者需要进行的操作；
* `AbstractSubject`抽象的主题类，引入了观察者。定义了添加和删除观察者，以及通知观察者的方法；
* 解耦，主题和观察者都依赖于抽象，各自的变化不会影响到对方；

![](https://github.com/yulc-coding/design-pattern/blob/master/src/main/java/org/ylc/note/observer/UML_Observer.png)
