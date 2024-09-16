
package com.mycompany.labrepo3;


// Box.java
class Box {
    private double length;
    private double width;

    // Constructor for square box (side)
    public Box(double side) {
        this.length = side;
        this.width = side;
    }

    // Constructor for rectangular box (length and width)
    public Box(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display box details
    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("-----------------------------");
    }


// Main.java

    public static void main(String[] args) {
        // Creating a square box (side = 5)
        Box squareBox = new Box(5.0);
        System.out.println("Square Box:");
        squareBox.displayInfo();

        // Creating a rectangular box (length = 10, width = 4)
        Box rectangularBox = new Box(10.0, 4.0);
        System.out.println("Rectangular Box:");
        rectangularBox.displayInfo();
    }

}
