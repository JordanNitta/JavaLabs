package Labs.PracticeExam.LabSix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //  System.out.println("Enter your full name:");
// Collect full name as a string from user input
        String fullName = scnr.nextLine();
// Need to split it into an array to format the string by index.
        String[] splitName = fullName.split(" ");

//Format and output the name as shown below
//lastInitial., firstName middleInitial.
        if(splitName.length == 3){
             String firstName = splitName[0];
             char middleInitial = splitName[1].toUpperCase().charAt(0);
             char lastInitial = splitName[2].toUpperCase().charAt(0);
             System.out.printf("%c., %s %c.%n", lastInitial, firstName, middleInitial);
        } else if(splitName.length == 2){
            String firstName = splitName[0];
            char middleInitial = splitName[1].toUpperCase().charAt(0);
            System.out.printf("%s., %s%n", middleInitial, firstName);
            }
        }
}
