package Labs;

import java.util.Scanner;

public class RemoveAllNonAlphabeticCharacters {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        String userInput = scrn.nextLine();
        String result = removeNonAlpha(userInput);
        System.out.println(result);
    }

    public static String removeNonAlpha(String userString){
        return userString.replaceAll("[^a-zA-Z]", "");
    }
}
