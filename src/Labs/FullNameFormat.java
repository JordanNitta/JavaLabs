package Labs;

import java.util.Locale;
import java.util.Scanner;

/*
Write a program that collects a full name as one string input.

Format and output the name as shown below:

lastInitial., firstName middleInitial.

If no middle name was provided, format and output the name as shown below:

lastInitial., firstName

If the input is:

Pat Silly Doe
the output is:

D., Pat S.
Alternatively, if the input is:

Julia Clark
the output is:

C., Julia
 */
public class FullNameFormat {
    public static void main(String[] args) {
// Need to create a instance of a Scanner
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter your full name:");
// Collect full name as a string from user input
        String fullName = scrn.nextLine();
// Need to split it into an array to format the string by index.
        String[] splitName = fullName.split(" ");

//Format and output the name as shown below
//lastInitial., firstName middleInitial.
        if(splitName.length == 3){
            String firstName = splitName[0];
            char middleInitial = splitName[1].toUpperCase().charAt(0);
            // Need to get the lastInitial from array and set a char data type and get the first letter
            char lastInitial = splitName[2].toUpperCase().charAt(0);
            System.out.printf("%c., %s %c.", lastInitial, firstName, middleInitial);
        } if(splitName.length == 2){
            String firstName = splitName[0];
            char middleInitial = splitName[1].toUpperCase().charAt(0);
            System.out.printf("%s., %s%n", middleInitial, firstName);
        }

    }
}
