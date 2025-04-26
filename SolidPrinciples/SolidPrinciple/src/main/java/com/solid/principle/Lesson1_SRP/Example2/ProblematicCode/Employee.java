package com.solid.principle.Lesson1_SRP.Example2.ProblematicCode;

//Any isssue with this class?
// Many reason to change this class
// should have only one reason to change like when we add new attribute only.
public class Employee {

    private int id;

    public int getId() {
        return 0;
    }

    public String fetchBioData() {
        return "Some bio data";
    }

    public double calculateSalary() {
        return 0;
    }

    public void printPerformanceData() {
        System.out.println("Some performance related data");
    }
}
