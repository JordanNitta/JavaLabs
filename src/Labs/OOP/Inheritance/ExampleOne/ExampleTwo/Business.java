package Labs.OOP.Inheritance.ExampleOne.ExampleTwo;

public class Business{
    protected String name;    // Member accessible by self and derived classes
    private String address;   // Member accessible only by self

    public void printMembers() { // Member accessible by anyone
        // Print information ...
    }

}
