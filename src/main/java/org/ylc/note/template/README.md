## 原型模式

通过把不变的操作放到父类中，去除子类中的重复代码，达到代码复用。

* 抽象父类定义所有的步骤方法
* 相同的步骤在抽象父类中实现
* 不同的步骤定义成抽象方法由具体的子类去继承实现

![](https://github.com/yulc-coding/design-pattern/blob/master/src/main/java/org/ylc/note/template/UML_Template.png)
