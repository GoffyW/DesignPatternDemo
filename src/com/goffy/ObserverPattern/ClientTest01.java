package com.goffy.ObserverPattern;

/**
 * 客户端测试之喜羊羊[具体观察者]
 * @Author:Goffy
 */
public class ClientTest01 {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();//灰太狼---被观察者
        Observer pleasantSheep = new PleasantSheep();//喜羊羊---观察者
        wolf.attach(pleasantSheep);//等级观察者
        wolf.invade();//灰太狼入侵
    }
}
