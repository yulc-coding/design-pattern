package org.ylc.note.template;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 定义所有的步骤
 * 父类实现相同的步骤
 * 不同的步骤由子类继承实现
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-10-10
 */
public abstract class AbstractTemplate {

    public void stepOne() {
        System.out.println("step 1 is same");
    }

    public void stepTwo() {
        System.out.println("step 2 is same");
    }

    /**
     * 不同的步骤由子类实现
     */
    abstract void stepThree();

    public void stepFour() {
        System.out.println("step 4 is same");
    }

    public void stepFive() {
        System.out.println("step 5 is same");
    }

    public void executeStep() {
        stepOne();
        stepTwo();
        stepThree();
        stepFour();
        stepFive();
    }
}
