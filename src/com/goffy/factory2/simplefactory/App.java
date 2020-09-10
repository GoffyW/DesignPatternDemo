package com.goffy.factory2.simplefactory;

/**
 * @author GoffyGUO
 */
public class App {
    public static void main(String[] args) {
        HuangMenJi huangMenJi = FoodFactory.huangMenJi();
        huangMenJi.addSpicy();
    }
}
