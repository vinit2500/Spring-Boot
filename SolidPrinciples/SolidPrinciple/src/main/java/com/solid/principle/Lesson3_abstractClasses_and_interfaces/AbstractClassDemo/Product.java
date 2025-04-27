package com.solid.principle.Lesson3_abstractClasses_and_interfaces.AbstractClassDemo;

public abstract class Product {

    public abstract double calculateDiscount();

    public void termsAndConditions() {
        System.out.println("Terms and conditions");
    }
}
