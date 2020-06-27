package org.ylc.note.decorator;

/**
 * 代码千万行，注释第一行，
 * 注释不规范，同事泪两行。
 * <p>
 * 抽象的装饰类
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020/6/27
 */
public abstract class AbstractDecorator extends AbstractComponent {

    protected AbstractComponent abstractComponent;

    public void setAbstractComponent(AbstractComponent abstractComponent) {
        this.abstractComponent = abstractComponent;
    }

    @Override
    public void operation() {
        if (abstractComponent != null) {
            abstractComponent.operation();
        }
    }
}
