package com.solid.principle.Lesson2_OCP.TakeHomeTask;

class InsuranceQuote {

}

class Vehicle {

}

class Car extends Vehicle {

}

class Truck extends Vehicle {

}

public class VehicleInsuranceEvaluator {

    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            // Logic for car insurance
            return new InsuranceQuote(/* some parameters */);
        } else if (vehicle instanceof Truck) {
            // Logic for truck insurance
            return new InsuranceQuote(/* some parameters */);
        }
        throw new IllegalArgumentException("Unsupported vehicle type.");
    }
}
