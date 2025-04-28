package com.solid.principle.Lesson5_interface_segregation.ProblematicCode;

public interface User {

    boolean canBuyProducts();
    boolean canModifyProducts();

    boolean canAddProducts();

    boolean canApproveProducts();

    void approveProduct();
}
