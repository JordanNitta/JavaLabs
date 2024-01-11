package Labs.OOP.Inheritance.ExampleOne.ExampleTwo;

public class Restaurant extends Business{
    private int rating;

    public void displayRestaurant() {
        // Attempted accesses
        printMembers();             // OK
        name = "Gyro Hero";         // OK    ("protected" above made this possible)
//        address = "5 Fifth St";    // ERROR
    }

    // Other class members ...
}

