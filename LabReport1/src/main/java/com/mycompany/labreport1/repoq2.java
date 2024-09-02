
package com.mycompany.labreport1;

import java.util.Scanner;

public class repoq2 {
    public static void main(String[] args) {
    
         Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        // Initialize the result variable
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    
    }
}
