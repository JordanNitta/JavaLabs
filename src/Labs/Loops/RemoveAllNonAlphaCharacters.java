package Labs.Loops;

import java.util.Scanner;
/*
Write a program that removes all non alpha characters from the given input.

Ex: If the input is:

-Hello, 1 world$!
the output is:

Helloworld

 */
public class RemoveAllNonAlphaCharacters {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = scnr.nextLine();

        String newWord = ""; // Declare newWord outside the loop

        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            if (Character.isLetter(currentChar)) {
                // Your logic for handling letters goes here
                newWord += currentChar;
            }
        }

        System.out.println(newWord);
    }
}
