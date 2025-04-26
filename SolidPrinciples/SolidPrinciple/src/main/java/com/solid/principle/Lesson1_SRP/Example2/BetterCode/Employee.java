package com.solid.principle.Lesson1_SRP.Example2.BetterCode;

public class Employee {

    private int id;

    public Employee(int id) {
        this.id = id;
    }

    // why only getter beacuse id is not set by a client
    public int getId() {
        return 0;
    }
}
