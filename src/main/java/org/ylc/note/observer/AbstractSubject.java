package org.ylc.note.observer;

import java.util.HashSet;
import java.util.Set;

/**
 * 代码全万行，注释第一行
 * 注释不规范，同事泪两行
 * <p>
 * 抽象的主题类，主题改变后通知相应的观察者
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020-07-06
 */
public abstract class AbstractSubject {

    private final Set<AbstractObserver> observers = new HashSet<>();

    /**
     * 添加观察者
     */
    public void attach(AbstractObserver observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     */
    public void detach(AbstractObserver observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notice() {
        observers.forEach(AbstractObserver::update);
    }

}
