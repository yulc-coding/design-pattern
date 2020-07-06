package org.ylc.note.observer;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 具体主题
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-07-06
 */
public class ConcreteSubject extends AbstractSubject {

    private final String subjectState;

    public ConcreteSubject(String subjectState) {
        this.subjectState = subjectState;
    }

    public void operation() {
        System.out.println("主题状态改变了，通知所有的观察者。。。");
        notice();
    }

    public String getSubjectState() {
        return subjectState;
    }

}
