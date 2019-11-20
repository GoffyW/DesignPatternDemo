package com.goffy.decorator;

/**
 * 具体装饰类：体
 * @Author:Goffy
 */
public class TiDecorator extends AdminToDecorator {
    public TiDecorator(AdminTo adminTo) {
        super(adminTo);
    }

    @Override
    public void enter() {
        System.out.println("这是具备“体”品质的学生");
        super.enter();
    }
}
