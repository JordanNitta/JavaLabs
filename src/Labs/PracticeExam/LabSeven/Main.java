package Labs.PracticeExam.LabSeven;

import java.util.Scanner;
/*
Write a program that collects any number of non-negative integer inputs and calculates the sum of the values. A negative integer should end the input collection and is not part of the sum.

Output the smallest non-negative value and the sum of the non-negative input values, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:

15
20
0
3
-1
the output is:

Smallest: 0
Sum: 38
 */
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        // int numsElement = scnr.nextInt();
        // Read the number of elements
        int numsElement = scnr.nextInt();
        int sum = 0;
        int min = numsElement;
        while(numsElement >= 0){
            sum += numsElement;
            if(min > numsElement){
                min = numsElement;
            }
            numsElement = scnr.nextInt();
        }
        System.out.println("Smallest: " + min);
        System.out.println("Sum: " + sum);

    }
}
