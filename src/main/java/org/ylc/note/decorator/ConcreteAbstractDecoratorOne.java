package org.ylc.note.decorator;

/**
 * 代码千万行，注释第一行，
 * 注释不规范，同事泪两行。
 * <p>
 * 具体装饰类
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020/6/27
 */
public class ConcreteAbstractDecoratorOne extends AbstractDecorator {

    @Override
    public void operation() {
        decoratorOne();
        super.operation();
    }

    private void decoratorOne() {
        System.out.println("在方法前执行装饰器ONE");
    }
}
