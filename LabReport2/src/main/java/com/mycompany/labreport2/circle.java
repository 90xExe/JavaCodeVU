
package com.mycompany.labreport2;

import java.util.Scanner;

public class circle {
    public double radius;
    public circle(double radius){
    this.radius = radius;
    }
    
    public double area(){
    return 3.1416 * radius * radius;
    }
    
        public double circumferce(){
    return 3.1416 * 2 * radius;
    }
            public void display(){
    System.out.println("Radius:"+ radius);
    System.out.println("Area:"+ area());
    System.out.println("Circumference:"+ circumferce());
    }
     public static void main(String[] args) {
     
         Scanner input = new Scanner(System.in);
         System.out.println("Enter RAdius: ");
         int r = input.nextInt();
         
         circle main = new circle(r);
         
         main.display();
     }
}
