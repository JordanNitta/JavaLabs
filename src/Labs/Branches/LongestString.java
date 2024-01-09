package Labs.Branches;

import java.util.Scanner;
/*
Write a program that takes two strings and outputs the longest string. If they are the same length then output the second string.

Ex. If the input is:

almond pistachio
the output is:

pistachio
 */
public class LongestString {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        /* Type your code here. */
        String firstString = scnr.next();

        String secondString = scnr.next();

        // Compare the lengths and print the result
        if (firstString.length() == secondString.length()) {
            System.out.println(secondString);
        } else if (firstString.length() > secondString.length()) {
            System.out.println(firstString);
        } else {
            System.out.println(secondString);
        }
    }
}
