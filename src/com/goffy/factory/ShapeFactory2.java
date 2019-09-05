package com.goffy.factory;

/**
 * 利用反射模式改善简单工厂，之前的不符合Java的开闭原则
 * @Author:Goffy
 */
public class ShapeFactory2 {
    public static Object getClass(Class<? extends Shape> clazz){
        Object object = null;
        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
