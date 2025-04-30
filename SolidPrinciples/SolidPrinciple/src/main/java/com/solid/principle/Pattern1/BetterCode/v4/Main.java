package com.solid.principle.Pattern1.BetterCode.v4;

public class Main {
    public static void main(String[] args) {

        Product p = Product.getBuilder().setName("Iphone").
                    setPrice(100).
                    setBrand("This is brand").
                    build();



    }
}
