package org.ylc.note.observer;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-07-06
 */
public class Run {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject("run");
        ConcreteObserver observer = new ConcreteObserver(subject);

        subject.attach(observer);
        subject.operation();

        subject.detach(observer);
        subject.operation();
    }

}
