
package com.mycompany.labreport2;


import java.util.Scanner;

public class student {

    public String fullname;
    public int id;
    public String dept;
    public int k=1;

    student() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input Fullname: ");
        fullname = input.nextLine();
        System.out.println("Input ID: ");
        id = input.nextInt();
         input.nextLine();
        System.out.println("Input Dept Name: ");
        dept = input.nextLine();
    }

    public void displayInfo() {
        System.out.println("Name: " + fullname);
        System.out.println("Id: " + id);
        System.out.println("Department: " + dept);
    }

    public static void main(String[] args) {
        
        student s1= new student();
        student s2= new student();
        System.out.println("Student 1 information:");
        s1.displayInfo();
        System.out.println("Student 2 information:");
        s2.displayInfo();
    }
}