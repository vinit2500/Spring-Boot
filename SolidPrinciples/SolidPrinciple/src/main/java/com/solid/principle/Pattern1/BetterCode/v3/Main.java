package com.solid.principle.Pattern1.BetterCode.v3;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setBrand("Apple");
        b.setName("Iphone");
        b.setPrice(1000);

        //rest of the attribute having default value

        Product p = new Product(b);

        /*
        Now Issues both class are tightly coupled each other
        issue 1 =>Builder b = null;
        Product p = new Product(b); Product p = new Product(null)

        -> This is another issue someone can pass null;
        issue 2 => Clients need to know about builder
        issue 3 => for every entity we need one Builder class
        */
    }
}
