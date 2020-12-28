package org.ylc.note.builder;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 指挥类
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-12-28
 */
public class Director {

    public void construct(AbstractBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
