package com.goffy.factory;

/**
 * @Author:Goffy
 */
public class Test03 {
    public static void main(String[] args) {
        Factory factory = new CircleFactory();
        Shape circle= factory.getShape();
        circle.draw();

    }
}
