package com.goffy.flyweight;

/**
 * 图书售卖的具体实现类
 * @Author:Goffy
 */
public class BookOrder implements FlyWeight{
    private String name;

    public BookOrder(String name) {
        this.name = name;
    }

    @Override
    public void cell() {
        System.out.println("卖了一本书，书名为:"+this.name+"。");
    }
}
