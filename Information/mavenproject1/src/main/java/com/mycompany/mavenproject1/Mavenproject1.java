
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //get all info
        System.out.println("Enter Your name: ");
        String name = input.nextLine();
        
         System.out.println("Enter Your University name: ");
        String uni = input.nextLine();
        
         System.out.println("Enter Your ID: ");
        int id = input.nextInt();
        //new line problem
        input.nextLine();
         System.out.println("Enter Your Section name: ");
        String sec = input.nextLine();
        
         System.out.println("Enter Batch number: ");
        int batch = input.nextInt();
        
         System.out.println("Enter Your CGPA: ");
        double cgpa = input.nextDouble();
        
        
        //output
        System.out.println("Name:"+ name);
        System.out.println("University:"+uni);
        System.out.println("ID:"+ id);
        System.out.println("Section:"+ sec);
        System.out.println("Batch:"+ batch);
        System.out.println("CGPA:" + cgpa);
        
    }
}
