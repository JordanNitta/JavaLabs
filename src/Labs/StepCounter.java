package Labs;

import java.util.Scanner;

public class StepCounter {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter how much steps you walked");
        double userSteps = scrn.nextDouble();

        System.out.println(feetToSteps(userSteps));
    }
    public static int feetToSteps(double userFeet){
        double oneStep = 2.5;
        return (int) (userFeet / oneStep);

    }

}
