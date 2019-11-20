package com.goffy.decorator;

/**
 * 具体装饰类：美
 * @Author:Goffy
 */
public class MeiDecorator extends AdminToDecorator{
    public MeiDecorator(AdminTo adminTo) {
        super(adminTo);
    }

    @Override
    public void enter() {
        System.out.println("这是具备“美”品质的学生");
        super.enter();
    }
}
