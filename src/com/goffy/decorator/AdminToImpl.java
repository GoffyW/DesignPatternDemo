package com.goffy.decorator;

/**
 * 定义录取接口的具体实现类
 * @Author:Goffy
 */
public class AdminToImpl implements AdminTo {
    @Override
    public void enter() {
        System.out.println("被录取");
    }
}
