
package com.mycompany.lab5;

// Interface Department with attributes and abstract methods
interface Department {
    // Constants for department name and head
    String deptName = "CSE"; // Default department name
    String deptHead = "Amin";  // Default department head

    // Abstract methods for printing department details
    void printDeptName();
    void printDeptHead();
}

// Class Office with attributes and methods
class Office {
    // Attributes for office information
    private String officeName;       // Name of the office
    private String officeLocation;    // Location of the office
    private int numberOfEmployees;    // Number of employees in the office

    // Method to set office information
    public void setOfficeInfo(String name, String location, int number) {
        this.officeName = name;
        this.officeLocation = location;
        this.numberOfEmployees = number;
    }

    // Getters for office information
    public String getOfficeName() {
        return officeName;
    }
    
    public String getOfficeLocation() {
        return officeLocation;
    }
    
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    // Method to display office details
    public void displayOfficeDetails() {
        System.out.println("Office Name: " + officeName);
        System.out.println("Office Location: " + officeLocation);
        System.out.println("Number of Employees: " + numberOfEmployees);
    }
}

// Class Employee extending Office and implementing Department
class Employee2 extends Office implements Department {
    // Attributes for employee information
    private int employeeId;          // Employee ID
    private String employeeName;     // Employee Name
    private String position;         // Employee Position

    // Method to set employee information
    public void setEmployeeInfo(int id, String name, String position) {
        this.employeeId = id;
        this.employeeName = name;
        this.position = position;
    }

    // Implementation of abstract methods from Department interface
    @Override
    public void printDeptName() {
        System.out.println("Department Name: " + deptName);
    }

    @Override
    public void printDeptHead() {
        System.out.println("Department Head: Prof. " + deptHead + " sir");
    }

    // Getters for employee information
    public int getEmployeeId() {
        return employeeId;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }

    public String getPosition() {
        return position;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Position: " + position);
    }
}
public class repoabstact3 {
     public static void main(String[] args) {
        // Creating an instance of Employee
        Employee2 emp = new Employee2();

        // Setting office details
        emp.setOfficeInfo("Main Office", "New York", 50);
        
        // Displaying office details
        emp.displayOfficeDetails();

        // Setting employee details
        emp.setEmployeeInfo(101, "Alice", "Software Engineer");

        // Displaying employee details
        emp.displayEmployeeDetails();

        // Printing department details
        emp.printDeptName();
        emp.printDeptHead();
    }
}
