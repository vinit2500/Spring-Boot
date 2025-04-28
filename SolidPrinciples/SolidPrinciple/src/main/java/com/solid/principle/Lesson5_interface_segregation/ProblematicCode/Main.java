package com.solid.principle.Lesson5_interface_segregation.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        This problematic code voilates not only interface segregation it is also voilating
        the liskov substitution principle because we have to check like user instance of Admin
        then call user.approveProduct()
        */
        List<User> users = new ArrayList<>();
        for(User user : users) {
            if(user instanceof Admin) {
                user.approveProduct();
            }
        }
    }
}
