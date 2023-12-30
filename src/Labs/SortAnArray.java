package Labs;

import java.util.Scanner;

public class SortAnArray {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scnr.nextInt();
        // Create an array of integers with the specified size
        int[] userArray = new int[size];

        // Read the input into the array;
        System.out.println("Enter " + size + " integers for array");
        for(int i = 0; i < size; i++){
            userArray[i] = scnr.nextInt();
            System.out.println("Here are the numbers you entered: " + userArray[i]);
        }

        int[] sortedArray = sortArray(userArray, size);

        // Iterate over the sorted array
        for (int i = 0; i < sortedArray.length; i++) {
            // Print the current element
            System.out.print(sortedArray[i]);

            // If it's not the last element, print a comma
            if (i < sortedArray.length - 1) {
                System.out.print(",");
            }
        }
    }

    public static int[] sortArray(int[] arr, int arrSize){
        // Outer loop iterates through each element of the array
        for(int i = 0; i < arrSize - 1; i++){
            // Inner loop iterates from the beginning of the array up to the (arrSize - 1 - i)-th element
            for(int j = 0; j < arrSize - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // If the current element is smaller than the next element, swap them
                    int temp = arr[j];
                    System.out.println(temp + "hiiiiiiii");
                    arr[j] = arr[j + 1];
                    System.out.println(arr[j] + "Bitchhhhhhh");
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
