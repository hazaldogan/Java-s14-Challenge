package com.workintech.burger.models;

import com.workintech.burger.enums.DrinkType;

public class Drinks {
    private DrinkType drinkType;
    public Drinks(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
    public DrinkType getType() {
        return drinkType;
    }


}
