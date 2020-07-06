package org.ylc.note.observer;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-07-06
 */
public class ConcreteObserver extends AbstractObserver {

    private final ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    void update() {
        System.out.println("subjectState:" + subject.getSubjectState() + "，observer 进行操作");
    }

}
