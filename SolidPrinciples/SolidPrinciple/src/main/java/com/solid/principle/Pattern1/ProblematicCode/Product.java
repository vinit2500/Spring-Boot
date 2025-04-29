package com.solid.principle.Pattern1.ProblematicCode;

import ch.qos.logback.core.util.SystemInfo;

import java.util.List;

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

    //problem here is that we are forcing to fill all the fields when create Product object
    Product(String name, String desc, int price, String brand, String category, int discount, String createdAt, String updatedAt, List<String> images) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.images = images;
    }

    Product(String name, int price) {

    }

    Product(String name, String desc, int price) {

    }

}
