package Labs.ObjectsAndClassesLab.Labs.VendingMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numDrinksToBuy = scnr.nextInt();
        int numBottlesToRestock = scnr.nextInt();
        VendingMachine vendingMachine = new VendingMachine();

        // Perform operations
        vendingMachine.purchase(numDrinksToBuy);
        vendingMachine.restock(numBottlesToRestock);

        // Report inventory
        vendingMachine.report();
    }
}
