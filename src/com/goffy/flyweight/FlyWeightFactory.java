package com.goffy.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:Goffy
 */
public class FlyWeightFactory {
    private Map<String,FlyWeight> map = new HashMap<>();
    private static FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
    public static FlyWeightFactory getInstance(){
        return flyWeightFactory;
    }

    public FlyWeight getOrder(String bookName){
        FlyWeight order = null;
        if (map.containsKey(bookName)){
            order = map.get(bookName);
        }else{
            order = new BookOrder(bookName);
            map.put(bookName, order);
        }
        return order;
    }

    public int getTotalObjects(){
        return map.size();
    }
}
