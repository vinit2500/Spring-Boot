package com.solid.principle.Pattern1.ProblematicCode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Product p = new Product("Iphone","This is an iphone", 1000, "Apple", "Mobile", 10, "2077-09-09", "2077-09-09", new ArrayList<>());

        /*
        Problem 1 here => we have to remember the order of argument making it hard to maintain.
        Problem 2 => what if we want to have some optional arguments, we will be forced to manually
        give some default values.

        The problem2 of forcefully passing arguments can be solved by constructor overloding but
        it solves one problem and create two problem
        1=> constructor explosion (too many constructor) => if we have 4 attribute then 2^4 = 16 possible constructor
        2 => Hard to maintain like currenty for 2 attribute you will create 16 but in future if attribute increase
        3 => issue (few of the constructor you will not be able to create)
        Product(String name, String desc, int price) {

        }

        Product(String name, String brand, int price) {

        }

        Compile time issue logically both are same changing the name of variable does not make them different constructor.
        */
    }
}
