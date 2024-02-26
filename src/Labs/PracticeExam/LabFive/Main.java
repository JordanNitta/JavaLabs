package Labs.PracticeExam.LabFive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        /* Type your code here. */
        int numOne = scnr.nextInt();
        int numTwo = scnr.nextInt();
        int numThree = scnr.nextInt();
        int sum = 0;

        if(numOne < 0 || numTwo < 0 || numThree < 0){
            System.out.println("Invalid input!");
        } else {
            sum = numOne + numTwo + numThree;
            if(sum % 3 == 0){
                System.out.println(numOne + "" + numTwo + ""+ numThree + " is divisible by 3!");
            }
            System.out.println(numOne + "" + numTwo + ""+ numThree + " is not divisible by 3!");
        }
    }
}

