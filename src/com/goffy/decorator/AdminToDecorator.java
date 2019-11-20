package com.goffy.decorator;

/**
 * 定义抽象装饰类
 * @Author:Goffy
 */
public abstract class AdminToDecorator implements AdminTo {
    private AdminTo adminTo;

    public AdminToDecorator(AdminTo adminTo) {
        this.adminTo = adminTo;
    }

    @Override
    public void enter() {
        if (this.adminTo!=null){
            adminTo.enter();
        }
    }
}
