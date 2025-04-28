package com.solid.principle.Lesson5_interface_segregation.BetterCode;

public class User implements ICanBuy {

    @Override
    public boolean buy() {
        return false;
    }
}
