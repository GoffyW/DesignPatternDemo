package com.goffy.observer;


/**
 * 客户端测试之懒洋洋
 * @Author:Goffy
 */
public class ClientTest02 {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Observer lazySheep=new LazySheep();
        wolf.attach(lazySheep);
        Observer pleasantSheep = new PleasantSheep();//喜羊羊---观察者
        wolf.attach(pleasantSheep);//等级观察者

        // 删除观察者
        wolf.dettach(pleasantSheep);

        wolf.invade();
    }

}
