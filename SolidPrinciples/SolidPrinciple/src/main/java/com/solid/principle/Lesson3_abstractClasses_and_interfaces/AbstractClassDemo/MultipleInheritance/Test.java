package com.solid.principle.Lesson3_abstractClasses_and_interfaces.AbstractClassDemo.MultipleInheritance;

/*
Problem with multiple inheritance
class A {

}

class B {

}

public class Test extends A,B {

}
*/

/*
Solution
 */

import java.util.ArrayList;

interface A {
    default void foo() {
        System.out.println("A");
    }
}

interface  B {
    default void foo() {
        System.out.println("B");
    }
}

class C implements A,B
{
    // or we can give our own foo method here if instead default void foo only void foo() in interface
    @Override
    public void foo() {
        B.super.foo();
    }
}

class Test
{
    public static void main(String[] args) {

    }
}