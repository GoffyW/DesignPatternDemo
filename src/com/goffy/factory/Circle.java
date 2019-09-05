package com.goffy.factory;

/**
 * @Author:Goffy
 */
public class Circle implements Shape {

    public Circle() {
        System.out.println("Circle");
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }
}
