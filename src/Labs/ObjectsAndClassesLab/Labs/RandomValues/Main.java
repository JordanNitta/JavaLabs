package Labs.ObjectsAndClassesLab.Labs.RandomValues;

import java.util.Scanner;

public class Main {
    // main method used to test your code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        RandomNumbers rn = new RandomNumbers();
        rn.setRandomValues(low, high);
        rn.getRandomValues();
    }
}
