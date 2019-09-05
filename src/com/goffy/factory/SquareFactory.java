package com.goffy.factory;

/**
 * 正方形工厂类
 * @Author:Goffy
 */
public class SquareFactory implements Factory {
    @Override
    public Shape getShape() {
        return new Square();
    }
}
