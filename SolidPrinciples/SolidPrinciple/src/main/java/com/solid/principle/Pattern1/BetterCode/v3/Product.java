package com.solid.principle.Pattern1.BetterCode.v3;

import java.util.List;

/*
Design pattern => DP is kind of like coding solution prepared for object oriented programming problem.
*/

public class Product {
    private String name;

    private String desc;

    private int price;

    private String brand;

    private String category;

    private int discount;

    private String createdAt;

    private String updatedAt;

    private List<String> images;


    Product(Builder b) {
        //Now we can validate before the Product object creation and this is called as Builder pattern.
        //There are many type of builder design pattern
        //This is Creational design pattern
        if(b.getPrice() > 0) {
            this.price = b.getPrice();
        }
//        .....
    }
}
