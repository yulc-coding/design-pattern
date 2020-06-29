package org.ylc.note.proxy;

/**
 * 代码千万行，注释第一行，
 * 注释不规范，同事泪两行。
 * <p>
 * 代理类
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2020/6/28
 */
public class ProxySubject extends AbstractSubject {

    private RealSubject realSubject;

    @Override
    public void operation() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.operation();
    }
}
