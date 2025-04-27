package com.solid.principle.Lesson3_abstractClasses_and_interfaces.AbstractClassDemo;

public class Macbook  extends Product{

    @Override
    public double calculateDiscount() {
        return 0;
    }

    public void termsAndConditions() {
        System.out.println("Terms of Mackbook");
    }
}
