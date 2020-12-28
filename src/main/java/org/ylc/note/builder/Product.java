package org.ylc.note.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 产品类
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-12-28
 */
public class Product {

    List<String> productParts = new ArrayList<>();

    public void addPart(String part) {
        this.productParts.add(part);
    }

    public void showParts() {
        this.productParts.forEach(System.out::println);
    }
}
