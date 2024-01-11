package Labs.OOP.Labs.PlantInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects
    public void printArrayList(ArrayList<Object> myGarden){
        for(int i = 0; i < myGarden.size(); i++){
            System.out.println(myGarden.get(i));
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String input;
        // TODO: Declare an ArrayList called myGarden that can hold object of type plant
        ArrayList<Object> myGarden = new ArrayList<Object>();
        // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual

        input = scnr.next();
        while(!input.equals("-1")){
            // TODO: Check if input is a plant or flower
            if(){
                //       Store as a plant object or flower object

            }
            //       Add to the ArrayList myGarden

            input = scnr.next();
        }

        // TODO: Call the method printArrayList to print myGarden

    }
}
