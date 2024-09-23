
package com.mycompany.labrepo4;

class Vehicle {
    private int numwheels;
    private double spreed;

    // Constructor for Vehicle
    public Vehicle(int numwheels, double spreed) {
        this.numwheels = numwheels;
        this.spreed = spreed;
    }

    // Method to display vehicle information
    public void displayvehicle() {
        System.out.println("Number of Wheels: " + numwheels);
        System.out.println("Speed: " + spreed);
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    private int numberOfPassengers;

    // Constructor for Car
    public Car(int numWheel, double speed, int numberOfPassengers) {
        super(numWheel, speed);
        this.numberOfPassengers = numberOfPassengers;
    }

    // Method to display car information
    public void displayCarInfo() {
        displayvehicle();  // Calls the displayvehicle method from Vehicle
        System.out.println("Number of passengers: " + numberOfPassengers);
    }
}

// Truck class extending Vehicle
class Truck extends Vehicle {
    private double loadLimit;

    // Constructor for Truck
    public Truck(int numWheel2, double speed2, double loadLimit) {
        super(numWheel2, speed2);
        this.loadLimit = loadLimit;
    }

    // Method to display truck information
    public void displayTruckInfo() {
        displayvehicle();  // Calls the displayvehicle method from Vehicle
        System.out.println("Load limit: " + loadLimit + " kg");
    }
}


public class Main {
    
     public static void main(String[] args) {
        // Car
        System.out.println("My Car Information: ");
        Car mycar = new Car(4, 340.5, 6);
        mycar.displayCarInfo();
        System.out.println();

        // Truck
        System.out.println("My Truck Information: ");
        Truck mytrack = new Truck(14, 240.5, 6000);
        mytrack.displayTruckInfo();
    }
}
