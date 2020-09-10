package com.goffy.factory2.simplefactory;

/**
 * @author GoffyGUO
 */
public interface Food {
    /**
     * 增加香料
     * @param name
     * @return
     */
    Food addSpicy();

    /**
     * 增加佐料
     * @param condiment
     * @return
     */
    Food addCondiment();

}
