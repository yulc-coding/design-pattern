package org.ylc.note.strategy;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 维护Strategy对象的引用
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-10-08
 */
public class Context {

    private final AbstractStrategy strategy;

    /**
     * 初始化指定具体的策略
     */
    public Context(AbstractStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略
     */
    public void strategyOperation() {
        strategy.operation();
    }

}
