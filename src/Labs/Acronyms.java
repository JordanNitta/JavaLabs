package Labs;

import java.util.Scanner;

/*
An acronym is a word formed from the initial letters of words in a set phrase.
Define a method named createAcronym that takes a string parameter and returns the acronym of the string parameter.
Append a period (.) after each letter in the acronym. If a word begins with a lower case letter, don't include that letter in the acronym.
Then write a main program that reads a phrase from input, calls createAcronym() with the input phrase as argument, and outputs the returned acronym.
Assume the input has at least one upper case letter.

Ex: If the input is:

Institute of Electrical and Electronics Engineers
the output should be:

I.E.E.E.
Ex: If the input is:

Association for computing MACHINERY
the output should be:

A.M.
Although the letters ACHINERY in MACHINERY are upper case, those letters are omitted for being a part of the word MACHINERY.

The program must define and call a method:
 */
public class Acronyms {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter your word");
        String userInput = scrn.next();
        String acronyms = createAcronym(userInput);
        System.out.println("Here " + acronyms);
    }

    public static String createAcronym(String userPhrase) {
        String[] splitWords = userPhrase.split(" ");
        StringBuilder acronymsBuilder = new StringBuilder();
        boolean newWord = true;  // Flag to track the beginning of a new word

        for (String word : splitWords) {
            // Check if the word is not empty
            if (!word.isEmpty()) {
                // Iterate through the characters of the word
                for (int i = 0; i < word.length(); i++) {
                    char currentChar = word.charAt(i);
                    // Check if the character is an uppercase letter
                    if (Character.isUpperCase(currentChar)) {
                        // Append the uppercase letter to the acronym
                        acronymsBuilder.append(currentChar);
                        newWord = false;  // We are no longer at the beginning of a new word
                    }
                }

                if (!newWord) {
                    acronymsBuilder.append('.');  // Append a period after each uppercase letter
                    newWord = true;  // Reset the flag for the next word
                }
            }
        }

        return acronymsBuilder.toString();
    }
}
