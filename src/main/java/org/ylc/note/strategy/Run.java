package org.ylc.note.strategy;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 执行入口
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-10-08
 */
public class Run {

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.strategyOperation();

        context = new Context(new ConcreteStrategyB());
        context.strategyOperation();

    }

}
