package com.goffy.factory;

/**
 * 圆形工厂类
 * @Author:Goffy
 */
public class CircleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
