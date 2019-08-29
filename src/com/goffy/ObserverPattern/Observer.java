package com.goffy.ObserverPattern;

/**
 * 抽象观察者
 * @Author:Goffy
 */
public interface Observer {

    String getName();

    /**
     * 通知更新方法
     * @param msg
     */
    void update(String msg);
}
