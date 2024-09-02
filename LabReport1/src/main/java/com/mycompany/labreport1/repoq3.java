
package com.mycompany.labreport1;

import java.util.Scanner;

/**
 *
 * @author nahid
 */
public class repoq3 {
    public static void main(String[] args) {
    
          Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize sum variable
        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit;            // Add the digit to the sum
            number /= 10;            // Remove the last digit from the number
        }

        // Output the result
        System.out.println("The sum of the digits is: " + sum);
    }
    
}
