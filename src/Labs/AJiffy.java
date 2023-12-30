package Labs;

import java.util.Scanner;

public class AJiffy {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter the number of jiffies: ");
        double userInput = scrn.nextDouble();
        double secondsValue = jiffiesToSeconds(userInput);
        System.out.printf("%.3f\n", secondsValue);
    }

    public static double jiffiesToSeconds(double userJiffie){
        double seconds = userJiffie * 0.01;
        return seconds;
    }
}
