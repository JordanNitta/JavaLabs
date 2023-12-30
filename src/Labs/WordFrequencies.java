package Labs;

import java.util.Scanner;

/*
Define a method named getWordFrequency that takes an array of strings, the size of the array, and a search word as parameters.
Method getWordFrequency() then returns the number of occurrences of the search word in the array parameter (case insensitive).

Then, write a main program that reads a list of words into an array, calls method getWordFrequency()
repeatedly, and outputs the words in the arrays with their frequencies.
The input begins with an integer indicating the number of words that follow. Assume that the list will always contain less than 20 words.

 */
public class WordFrequencies {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read the number of words
        int numWords = scnr.nextInt();
        // Create an array to store the words
        String[] wordsList = new String[numWords];
        // Read the words into the array
        for (int i = 0; i < numWords; i++) {
            wordsList[i] = scnr.next();
        }

        // Process each word and print its frequency
        for (String word : wordsList) {
            int frequency = getWordFrequency(wordsList, numWords, word);
            System.out.println(word + " " + frequency);
        }
    }
    // Method to get the frequency of a word in the array
    public static int getWordFrequency(String[] wordsList, int listSize, String currWord) {
        int frequency = 0;
        // Iterate through the array and count occurrences of the search word (case-insensitive)
        for (String word : wordsList) {
            if (word.equalsIgnoreCase(currWord)) {
                frequency++;
            }
        }
        return frequency;
    }
}
