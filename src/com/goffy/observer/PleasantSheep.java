package com.goffy.observer;

/**
 * 具体观察者
 * @Author:Goffy
 * 实现抽象观察者
 */
public class PleasantSheep implements Observer {
    @Override
    public String getName() {
        return "喜羊羊";
    }

    @Override
    public void update(String msg) {
        System.out.println("喜羊羊收到通知："+msg);
    }
}
