package Labs.Loops;

import java.util.Scanner;
/*
Write a program that takes in a line of text as input, and outputs that line of text in reverse. The program repeats, ending when the user enters "Done", "done", or "d" for the line of text.

Ex: If the input is:

Hello there
Hey
done
the output is:

ereht olleH
yeH
 */
public class PrintStringInReverse {
    public static void main(String[] args) {
        /* Type your code here. */
        Scanner scrn = new Scanner(System.in);
        String word = scrn.nextLine();
        String reversedString = "";
        while (!word.equalsIgnoreCase("Done") && !word.equalsIgnoreCase("d")) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedString += word.charAt(i);
            }
            System.out.println(reversedString);

            // Reset the reversedString for the next input
            reversedString = "";
            word = scrn.nextLine();
        }
    }
}
