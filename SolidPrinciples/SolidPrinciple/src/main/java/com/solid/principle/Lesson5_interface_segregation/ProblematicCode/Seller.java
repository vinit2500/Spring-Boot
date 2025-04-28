package com.solid.principle.Lesson5_interface_segregation.ProblematicCode;

public class Seller implements User {
    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        //forced to implement this
        return false;
    }

    @Override
    public void approveProduct() {

    }
}
