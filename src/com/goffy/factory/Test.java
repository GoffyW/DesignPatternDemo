package com.goffy.factory;

/**
 * @Author:Goffy
 */
public class Test {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
    }
}
