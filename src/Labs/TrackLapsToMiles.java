package Labs;

import java.util.Scanner;
/*
One lap around a standard high-school running track is exactly 0.25 miles.
Define a method named lapsToMiles that takes a double as a parameter, representing the number of laps,
and returns a double that represents the number of miles.
Then, write a main program that takes a number of laps as an input, calls method lapsToMiles() to calculate the number of miles, and outputs the number of miles.

Output each floating-point value with two digits after the decimal point.

Ex: If the input is:

7.6
the output is:

1.90
 */
public class TrackLapsToMiles {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);

        System.out.println("Enter number of laps:");
        double numberOfLaps = scrn.nextDouble();

        double numberOfMiles = lapsToMiles(numberOfLaps);
        System.out.printf("%.2f%n", numberOfMiles);


    }

    public static double lapsToMiles(double userLaps){
        double track = 0.25;
        return userLaps * track;
    }
}
