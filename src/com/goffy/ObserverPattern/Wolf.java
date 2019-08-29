package com.goffy.ObserverPattern;

/**
 * 具体被观察者，此处抽象为灰太狼
 * @Author:Goffy
 */
public class Wolf extends Subject {
     public void invade(){
         System.out.println("灰太狼：我要搞事情了");
         notifyAllObserver();
     }

}
