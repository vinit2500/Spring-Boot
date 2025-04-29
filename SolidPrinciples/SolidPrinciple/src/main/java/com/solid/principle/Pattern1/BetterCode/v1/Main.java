package com.solid.principle.Pattern1.BetterCode.v1;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        // problem setting value after object creation
        p.setName("Iphone");
        p.setDesc("This is an iphone");
        p.setBrand("Apple");
        p.setPrice(1000);

        /*
            => using getter setter
              Benefit => code is more readable, managable, extendable
              Issue1 => how to validate before object creation => object craetion means memory mai value mile usko uske phele
              like here Product p = new Product() but yha to create ho gya object
              Issue2 => what about immutable object because setter not exists for immutable object

              conclusion => Just using setter will not work and having too many argument in constructor not work.
        */
    }
}
