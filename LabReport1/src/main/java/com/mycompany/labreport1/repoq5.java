
package com.mycompany.labreport1;

import java.util.Scanner;

/**
 *
 * @author nahid
 */
public class repoq5 {
    public static void main(String[] args){
    
            Scanner scanner = new Scanner(System.in);

        // Input the size of the arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        // Initialize the arrays
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int[] sumArray = new int[size];

        // Input elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Input elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Calculate the element-wise sum of the two arrays
        for (int i = 0; i < size; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // Output the result
        System.out.println("The element-wise sum of the two arrays is:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + sumArray[i]);
        }
    }
}
