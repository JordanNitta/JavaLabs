package Labs;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.print("Enter a character and a string: ");
        char userChar = scrn.next().charAt(0);

        String userString = scrn.nextLine();

        // Call calcNumCharacters method and output the result
        int count = calcNumCharacters(userString, userChar);
        System.out.println(count + " " + userChar + (count != 1 ? "'s" : ""));

    }

    public static int calcNumCharacters(String userString, char userChar) {
        int charCount = 0;

        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == userChar) {
                charCount++;
            }
        }
        return charCount;
    }

}
