package Labs.PracticeExam.LabNine;

import java.util.Random;
import java.util.Scanner;

/*
Define a method named "showResults" with one parameter. The parameter should reference a random object rand. The showResults() method should generate a random integer of 0 or 1 using the random object reference rand. If the random number generated is equal to 1, return "true". If the random number generated is equal to 0, return "false".

In the main() method template, the rand variable has already been assigned a random object with a seed value of 2. Write a program that collects one integer value as input, assumed to be greater than 0. Use a loop to call the showResults() method a number of times equal to the integer input. e.g., If 3 is entered as input, then showResults() will be called 3 times, each time returning "true" or "false".

Output the returned Boolean values on separate lines, ending with a newline.

If the input is:

3
the output with a random object seed value of 2 is:

true
false
true
 */
public class Main {
    /* Define your method here */
    // Define a method named "showResults" with one parameter.
    public static boolean showResults(Random rand){
        //should generate a random integer of 0 or 1 using the random object reference rand.
        int randomNumber = rand.nextInt(2);
        // If the random number generated is equal to 1, return "true".
        // If the random number generated is equal to 0, return "false".
        if(randomNumber == 1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2); // Seed used in develop mode
        /* Type your code here. */
        int inputValue = scnr.nextInt();
// Write a program that collects one integer value as input, assumed to be greater than 0.
// Use a loop to call the showResults() method a number of times equal to the integer input. e.g.,
// If 3 is entered as input, then showResults() will be called 3 times,
// each time returning "true" or "false".


        for(int i = 0; i < inputValue; i++){
            System.out.println(showResults(rand));
        }

    }
}
