package com.goffy.decorator;

/**
 * 具体的装饰类：德
 * @Author:Goffy
 */
public class DeDecorator extends AdminToDecorator {

    public DeDecorator(AdminTo adminTo) {
        super(adminTo);
    }

    @Override
    public void enter() {
        System.out.println("这是具备“德”品质的学生");
        super.enter();
    }
}
