package Labs.PracticeExam.LabTen;
import Labs.PracticeExam.LabTen.Customer;

import java.util.Scanner;

/*
An existing class Customer() has been provided in Customer.java. Write a program in main() of CustomerAge.java to accept one string input and one integer input for a customer's name and age fields, respectively. Use the existing customer1 and customer2 reference variables provided in the template to set the name and age of both customer objects using the setName() and setAge() methods. Determine which customer is older using its getAge() method.

Output the older customer's information using its printInfo() method, ending with a newline. Ensure your program output matches the example formatting below and works for a variety of input values.

If the input is:

Jane
25
John
29
the output is:

Customer that is older:
Name: John
Age: 29
 */
public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        // TODO: Declare name and age variables (string, and int)
        String name = scnr.nextLine();;
        int age = scnr.nextInt();
        scnr.nextLine();
        String name1 = scnr.nextLine();;
        int age1 = scnr.nextInt();

        // TODO: Read name and age input for customer 1
        ;

        // TODO: Set customer 1 name and age fields using mutator methods (setName() and setAge())
        customer1.setName(name);
        customer1.setAge(age);


        // TODO: Read name and age input for customer 2

        // TODO: Set customer 2 name and age fields using mutator methods (setName() and setAge())
        customer2.setName(name1);
        customer2.setAge(age1);

        System.out.println("Customer that is older:");

        /// TODO: Determine older customer (use getAge())
        //       and output older customer's info (use printInfo())
        if (customer1.getAge() > customer2.getAge()) {
            customer1.printInfo();
        } else {
            customer2.printInfo();
        }
    }
}
