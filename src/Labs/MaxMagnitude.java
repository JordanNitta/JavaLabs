package Labs;

import java.util.Scanner;

public class MaxMagnitude {
    /*
Write a method maxMagnitude() with three integer parameters that returns the largest magnitude value.
Use the method in the main program that takes three integer inputs and outputs the largest magnitude value.

Ex: If the inputs are:

5 7 9
method maxMagnitude() returns and the main program outputs:
9
Ex: If the inputs are:
-17 -8 -2
method maxMagnitude() returns and the main program outputs:
-17
Note: The method does not just return the largest value, which for -17 -8 -2 would be -2.
Though not necessary, you may use the absolute-value built-in math method.


     */
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter integers for your magnitude");
        int numOne = scrn.nextInt();
        int numTwo = scrn.nextInt();
        int numThree = scrn.nextInt();
        int results = maxMagnitude(numOne, numTwo, numThree);
        System.out.println(results);
    }


    public static int maxMagnitude(int userVal1, int userVal2, int userVal3) {
        int magnitude1 = Math.abs(userVal1);
        int magnitude2 = Math.abs(userVal2);
        int magnitude3 = Math.abs(userVal3);

        int highestMagnitude = Math.max(magnitude1, Math.max(magnitude2, magnitude3));

        // Determine which input had the highest magnitude and return it with its original sign
        if (highestMagnitude == magnitude1) {
            return userVal1;
        } else if (highestMagnitude == magnitude2) {
            return userVal2;
        } else {
            return userVal3;
        }
    }


}
