package com.goffy.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author GUO
 */
public class MedalServicesFactory {
    private static final Map<String,IMedalService> map = new HashMap<>();
    static {
        map.put("guard",new GuardMedalServiceImpl());
        map.put("vip",new VipMedalServiceImpl());
        map.put("guest",new GuestMedalServiceImpl());
    }
    public static IMedalService getService(String medalType){
        return map.get(medalType);
    }
}
