package com.solid.principle.Pattern1.BetterCode.v2;

import java.util.HashMap;
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

    Product(HashMap<String,Object> mp) {
        //Now the best part is we can validate
        if(mp.get("price").equals(0)) {

        }
    }

    /*
    ISSUES : 
     # what if hashmap do not have a property as a key.
     # in the hashmap what if there is a spelling mistake in propery

     price -> Price like this
     we are givin6g opportunity to caller of the product class to make a miskates that sign of bad code

     SOLUTION => object of another class which have all the same attribute as Product class
     let's create one class name Builder
    */

}

