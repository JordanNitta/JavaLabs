package Labs.Branches;

import java.util.Scanner;
/*
Write a program that takes in three integers and outputs the largest value. If the input integers are the same, output the integers' value.

Ex: If the input is:

1 2 3
the output is:

3
 */
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        int[] numArray = new int[3];

        // Read three integers from user input and store them in the array
        for (int i = 0; i < 3; i++) {
            numArray[i] = scnr.nextInt();
        }

        // Find the largest value in the array
        int largestValue = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if (numArray[i] > largestValue) {
                largestValue = numArray[i];
            }
        }

        // Output the result
        System.out.println(largestValue);
    }
}
