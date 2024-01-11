package Labs.ObjectsAndClassesLab.Labs.ProductClass;

public class Main {
    public static void main(String[] args) {
        String name = "Apple";
        double price = 0.40;
        int num = 3;
        Product p = new Product(name, price, num);

        // Test 1 - Are instance variables set/returned properly?
        System.out.println("Name: " + p.getCode());   // Should be 'Apple'
        System.out.printf("Price: %.2f\n", p.getPrice()); // Should be '0.40'
        System.out.println("Count: " + p.getCount()); // Should be 3
        System.out.println();

        // Test 2 - Are instance variables set/returned properly after adding and selling?
        num = 10;
        p.addInventory(num);
        num = 5;
        p.sellInventory(num);
        System.out.println("Name: " + p.getCode()); // Should be 'Apple'
        System.out.printf("Price: %.2f\n", p.getPrice()); // Should be '0.40'
        System.out.println("Count: " + p.getCount()); // Should be 8
        System.out.println();

        // Test 3 - Do setters work properly?
        name = "Golden Delicious";
        p.setCode(name);
        price = 0.55;
        p.setPrice(price);
        num = 4;
        p.setCount(num);
        System.out.println("Name: " + p.getCode()); // Should be 'Golden Delicious'
        System.out.printf("Price: %.2f\n", p.getPrice()); // Should be '0.55'
        System.out.println("Count: " + p.getCount()); // Should be 4
    }
}
