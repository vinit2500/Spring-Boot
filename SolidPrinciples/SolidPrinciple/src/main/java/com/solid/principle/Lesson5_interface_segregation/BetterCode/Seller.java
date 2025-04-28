package com.solid.principle.Lesson5_interface_segregation.BetterCode;

public class Seller implements ICanModify, ICanBuy, ICanSell{
    @Override
    public boolean buy() {
        return false;
    }

    @Override
    public void modify() {

    }

    @Override
    public void sell() {

    }
}
