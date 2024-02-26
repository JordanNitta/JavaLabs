package Labs.PracticeExam.LabFourteen;

import java.util.Scanner;

/*
Write code in the Customer class of Customer.java to do the following:

Create a Grocery ArrayList.
Define a method named getGroceryList that returns the Grocery ArrayList.
Use the method signature public ArrayList<Grocery> getGroceryList()
Define a method named addGrocery with a Grocery parameter variable.
The addGrocery method should add a Grocery object to the Grocery ArrayList via the parameter.
Use the method signature public void addGrocery(Grocery grocery)
If the input is:

John
Eggs
5.99
12
y
Oatmeal
8.99
1
n
the output when "John" is the name of the customer, "Eggs" are a grocery item, 5.99 is the price, 12 is the quantity, "y" is a value indicating "yes" to enter more items, "Oatmeal" is another grocery item, 8.99 is the price, 1 is the quantity, and "n" is a value indicating "no" to stop entering more items is:

John has the following items:

Item: Eggs
Price: 5.99
Quantity: 12

Item: Oatmeal
Price: 8.99
Quantity: 1

Total: 14.98
 */
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String name, item;
        double price, total = 0;
        int quantity;

        Grocery  grocery = null;
        Customer customer1 = new Customer();
        name = scnr.next();

        String sentinel = "y";

        do{

            item = scnr.next();
            price = scnr.nextDouble();
            quantity = scnr.nextInt();

            grocery = new Grocery(item, price, quantity);
            customer1.addGrocery(grocery);

            sentinel = scnr.next();

        }while(sentinel.equals("y"));

        System.out.println(name + " has the following items:\n");

        for(Grocery g : customer1.getGroceryList()){
            System.out.println("Item: " + g.getItem());
            System.out.println("Price: " + g.getPrice());
            System.out.println("Quantity: " + g.getQuantity() + "\n");
            total += g.getPrice();
        }

        System.out.println("Total: " + total);
    }
}
