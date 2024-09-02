
package com.mycompany.labreport1;

import java.util.Scanner;

public class repoq4 {
    public static void main(String[] args){
    
          Scanner scanner = new Scanner(System.in);

        // Input the number of terms (n)
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        // Initialize sum variable
        double sum = 0.0;

        // Calculate the sum of the series
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / factorial(i);
        }

        // Output the result
        System.out.printf("The sum of the series up to %d terms is: %.6f%n", n, sum);
    }

      public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
    
}
