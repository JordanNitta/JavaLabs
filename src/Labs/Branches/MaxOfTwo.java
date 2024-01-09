package Labs.Branches;

import java.util.Scanner;
/*
Write a program that takes in two integers and outputs the larger value. If the two integers are the same, output the integers' value.

Ex: If the input is:

4 2
the output is:

4
 */
public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();
        if(num1 == num2){
            System.out.println(num1);
        } else if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
