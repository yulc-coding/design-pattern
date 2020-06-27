package org.ylc.note.decorator;

/**
 * 代码千万行，注释第一行，
 * 注释不规范，同事泪两行。
 * <p>
 * 执行方法
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020/6/27
 */
public class Run {

    public static void main(String[] args) {

        ConcreteAbstractComponent component = new ConcreteAbstractComponent();
        ConcreteAbstractDecoratorOne decoratorOne = new ConcreteAbstractDecoratorOne();
        ConcreteAbstractDecoratorTwo decoratorTwo = new ConcreteAbstractDecoratorTwo();

        decoratorOne.setAbstractComponent(component);
        decoratorTwo.setAbstractComponent(decoratorOne);

        decoratorTwo.operation();
    }
}
