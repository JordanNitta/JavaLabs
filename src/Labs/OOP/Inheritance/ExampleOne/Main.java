package Labs.OOP.Inheritance.ExampleOne;

public class Main {
    public static void main(String[] args) {
        ProduceItem produce1 = new ProduceItem();
        // Set properties for the produce item (example)
        produce1.setName("Apple");
        produce1.setQuantity(10);
        produce1.setExpiration("2022-01-10");

        // Print details of the produce item
        System.out.println("Produce Item Details:");
        produce1.printItem();
        System.out.println("Expiration Date: " + produce1.getExpiration());
    }
}

