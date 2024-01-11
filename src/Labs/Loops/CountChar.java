package Labs.Loops;

import java.util.Locale;
import java.util.Scanner;
/*
Write a program whose input is a character and a string, and whose output indicates the number of times the character appears in the string. The output should include the input character and use the plural form, n's, if the number of times the characters appears is not exactly 1.

Ex: If the input is:

n Monday
the output is:

1 n
Ex: If the input is:

z Today is Monday
the output is:

0 z's
Ex: If the input is:

n It's a sunny day
the output is:

2 n's
Case matters.

Ex: If the input is:

n Nobody
the output is:

0 n's
n is different than N.
 */
public class CountChar {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scnr = new Scanner(System.in);
        char letter = scnr.next().charAt(0);
        String userInput = scnr.nextLine();
        int counter = 0;

        // Loop through each character in the string
        for (int i = 0; i < userInput.length(); i++) {
            // Compare characters using charAt(i)
            if (userInput.charAt(i) == letter || Character.toUpperCase(userInput.charAt(i)) == Character.toUpperCase(letter)) {
                counter++;
            }
        }

        // Output the result
        if (counter == 1) {
            System.out.println("1 " + letter);
        } else {
            System.out.println(counter + " " + letter + "'s");
        }
    }
}
