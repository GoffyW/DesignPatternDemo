package com.goffy.factory2.simplefactory;

public class HuangMenJi implements Food {
    @Override
    public Food addSpicy() {
        System.out.println("这是黄焖鸡添加香料的操作");
        return new HuangMenJi();
    }

    @Override
    public Food addCondiment() {
        System.out.println("这是黄焖鸡添加佐料的操作");
        return new HuangMenJi();
    }
}
