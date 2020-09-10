package com.goffy.factory2.simplefactory;

/**
 * @author GoffyGUO
 */
public class LanZhouNoodles implements Food {


    @Override
    public Food addSpicy() {
        System.out.println("这是兰州面条添加香料的操作");
        return new LanZhouNoodles();
    }

    @Override
    public Food addCondiment() {
        System.out.println("这是兰州面条添加佐料的操作");
        return new LanZhouNoodles();
    }
}
