package Labs;

import java.util.Scanner;

public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int userInput = scrn.nextInt();

        // Call the intToReverseBinary method to convert the integer to binary
        String binaryResult = intToReverseBinary(userInput);

        // Display the result
        System.out.println("Binary representation (in reverse): " + binaryResult);
    }
    public static String intToReverseBinary(int integerValue){
        StringBuilder binaryStringBuilder = new StringBuilder();

        while (integerValue > 0) {
            // Calculate remainder, append to StringBuilder, and update integerValue
            binaryStringBuilder.append(integerValue % 2);
            System.out.println(binaryStringBuilder);
            integerValue /= 2;
        }

        // Return the reversed binary string using stringReverse method
        return stringReverse(binaryStringBuilder.toString());
    }

    public static String stringReverse(String inputString){
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--){
            reversedStringBuilder.append(inputString.charAt(i));
        }
        return reversedStringBuilder.toString();
    }
}
