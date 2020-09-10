package com.goffy.Strategy;

/**
 * @author GUO
 */
public class StrategyTest {
    public static void main(String[] args) {
        IMedalService vip = MedalServicesFactory.getService("vip");
        vip.showMedal();
    }
}
