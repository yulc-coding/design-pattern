package org.ylc.note.builder;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 自定义构建者
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-12-28
 */
public class CustomBuilder extends AbstractBuilder {

    Product product = new Product();

    @Override
    void buildPartA() {
        this.product.addPart("A");
        System.out.println("build A");
    }

    @Override
    void buildPartB() {
        this.product.addPart("B");
        System.out.println("build B");
    }

    @Override
    Product getProduct() {
        return this.product;
    }
}
