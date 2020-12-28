package org.ylc.note.builder;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 抽象的构建者类
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-12-28
 */
public abstract class AbstractBuilder {

    abstract void buildPartA();

    abstract void buildPartB();

    abstract Product getProduct();
}
