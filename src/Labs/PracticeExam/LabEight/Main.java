package Labs.PracticeExam.LabEight;

import java.util.Scanner;
/*
Write a program that creates an array to hold three values of type double. The program should collect the three double values as input and store them in the array. Then calculate the average value of the array.

Output the array values and calculated average value, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:

10.0
10.5
11.0
the output is:

Array items: 10.0, 10.5, 11.0
Average: 10.5
 */
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */

        // Write a program that creates an array to hold three values of type double.
        double[] threeArry = new double[3];
        double sum = 0;
        for(int i = 0; i < threeArry.length; i++){
            threeArry[i] = scnr.nextDouble();
            sum += threeArry[i];
        }
        double average = sum / 3;

        System.out.println("Array items: " + threeArry[0] + ", " + threeArry[1] + ", " + threeArry[2]);
        System.out.println("Average: " + average);
    }
}
