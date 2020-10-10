package org.ylc.note.template;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-10-10
 */
public class Run {

    public static void main(String[] args) {
        CustomStepA stepA = new CustomStepA();

        CustomStepB stepB = new CustomStepB();

        System.out.println("执行A：");
        stepA.executeStep();

        System.out.println("\r\n执行B：");
        stepB.executeStep();
    }
}
