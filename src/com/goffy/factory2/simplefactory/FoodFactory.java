package com.goffy.factory2.simplefactory;

/**
 * @author GoffyGUO
 */
public class FoodFactory {
    public static LanZhouNoodles lanZhouNoodle(){
        return new LanZhouNoodles();
    }
    public static HuangMenJi huangMenJi(){
        return new HuangMenJi();
    }

}
