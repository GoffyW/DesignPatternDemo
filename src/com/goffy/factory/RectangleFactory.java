package com.goffy.factory;

/**
 * 长方形工厂类
 * @Author:Goffy
 */
public class RectangleFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
