package org.ylc.note.builder;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-12-28
 */
public class Run {

    public static void main(String[] args) {
        Director director = new Director();

        AbstractBuilder builder = new CustomBuilder();
        director.construct(builder);
        builder.getProduct().showParts();

    }
}
