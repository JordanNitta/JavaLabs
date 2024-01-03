package Labs;

import java.util.Scanner;

/*
Write a program whose inputs are four integers, and whose outputs are the maximum and the minimum of the four values.

Ex: If the input is:

12 18 4 9
the output is:

Maximum is 18
Minimum is 4
The program must define and call the following two methods.
Define a method named maxNumber that takes four integer parameters and returns an integer representing the maximum of the four integers.
Define a method named minNumber that takes four integer parameters and returns an integer representing the minimum of the four integers.
 */
public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int numOne = scrn.nextInt();
        int numTwo = scrn.nextInt();
        int numThree = scrn.nextInt();
        int numFour = scrn.nextInt();

        int maximum = maxNumber(numOne, numTwo, numThree, numFour);
        System.out.println("Maximum is " + maximum);

        int minimum = minNumber(numOne, numTwo, numThree, numFour);
        System.out.println("Minimum is " + minimum);
    }

    public static int maxNumber(int num1, int num2, int num3, int num4){
        int[] numbers = {num1, num2, num3, num4};
        int max = numbers[0];
        for (int number : numbers){
            if(number > max){
                max = number;
            }
        }
        return max;
    }
    public static int minNumber(int num1, int num2, int num3, int num4){
        int[] numbers = {num1, num2, num3, num4};
        int min = numbers[0];
        for(int number: numbers){
            if(number < min){
                min = number;
            }
        }
        return min;
    }

}
