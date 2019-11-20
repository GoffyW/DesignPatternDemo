package com.goffy.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象被观察者
 * @Author:Goffy
 */
public abstract class Subject {
    /**
     * 抽象被观察者集合
     */
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 登记观察者
     * @param observer
     */
    public void attach(Observer observer){
        observerList.add(observer);
        System.out.println("增加了观察者："+observer.getName());
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void dettach(Observer observer){
        observerList.remove(observer);
        System.out.println("删除了观察者"+observer.getName());
    }

    /**
     * 通知所有观察者
     */
    public void notifyAllObserver(){
        for (Observer observerList : observerList){
            observerList.update("灰太狼要搞事情了");
        }
    }

}
