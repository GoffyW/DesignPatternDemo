package com.goffy.decorator;

/**
 * 具体的装饰类：智
 * @Author:Goffy
 */
public class ZhiDecorator extends AdminToDecorator {

    public ZhiDecorator(AdminTo adminTo) {
        super(adminTo);
    }

    @Override
    public void enter() {
        System.out.println("这是具备“智”品质的学生");
        super.enter();
    }
}
