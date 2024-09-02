
package com.mycompany.labreport1;

import java.util.Scanner;

/**
 *
 * @author nahid
 */
public class repoq6 {
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Input elements for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Initialize max and min with the first element of the array
        int max = array[0];
        int min = array[0];

        // Find the maximum and minimum elements in the array
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        // Calculate the difference between max and min
        int difference = max - min;

        // Output the result
        System.out.println("The difference between the maximum and minimum values is: " + difference);

    }
}
