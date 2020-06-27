package org.ylc.note.decorator;

/**
 * 代码千万行，注释第一行，
 * 注释不规范，同事泪两行。
 * <p>
 * 具体的对象
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020/6/27
 */
public class ConcreteAbstractComponent extends AbstractComponent {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
