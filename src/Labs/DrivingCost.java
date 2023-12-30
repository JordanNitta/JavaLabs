package Labs;

import java.util.Scanner;

/*
Define that method in a program whose inputs are the car's miles per gallon
and the price of gas in dollars per gallon (both doubles). Output the gas cost for 10 miles, 50 miles,
and 400 miles, by calling your drivingCost() method three times.

Output each floating-point value with two digits after the decimal point, which can be achieved as follows:
System.out.printf("%.2f", yourValue);

The output ends with a newline.

Ex: If the input is:

20.0 3.1599
the output is:

1.58 7.90 63.20
Your program must define and call a method:
public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven)
 */
public class DrivingCost {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter miles per gallon: ");
        double carMilesPerGallon = scrn.nextDouble();
        System.out.println("Enter dollars per gallon: ");
        double dollarPerGallon = scrn.nextDouble();

        // Call drivingCost method three times with different milesDriven values
        double costFor10Miles = drivingCost(carMilesPerGallon, dollarPerGallon, 10.0);
        double costFor50Miles = drivingCost(carMilesPerGallon, dollarPerGallon, 50.0);
        double costFor400Miles = drivingCost(carMilesPerGallon, dollarPerGallon, 400.0);

        System.out.printf("%.2f %.2f %.2f%n", costFor10Miles, costFor50Miles, costFor400Miles);
    }
    /*
Write a method drivingCost() with input parameters milesPerGallon, dollarsPerGallon,
and milesDriven that returns the dollar cost to drive those miles. All items are of type double.
The method called with arguments (20.0, 3.1599, 50.0) returns 7.89975.

Define that method in a program whose inputs are the car's miles per gallon
and the price of gas in dollars per gallon (both doubles). Output the gas cost for 10 miles, 50 miles,
and 400 miles, by calling your drivingCost() method three times.

     */
    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven){
        double results = (milesDriven / milesPerGallon) * dollarsPerGallon;
        return results;
    }
}
