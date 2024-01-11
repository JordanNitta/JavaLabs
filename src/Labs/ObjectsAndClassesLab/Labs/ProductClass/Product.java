package Labs.ObjectsAndClassesLab.Labs.ProductClass;
/*

Given main(), define the Product class (in file Product.java) that will manage product inventory. Product class has three private member fields: a product code (String), the product's price (double), and the number count of product in inventory (int).

Implement the following Constructor and member methods:

public Product(String code, double price, int count) - set the member fields using the three parameters
public void setCode(String code) - set the product code (i.e. SKU234) to parameter code
public String getCode() - return the product code
public void setPrice(double p) - set the price to parameter p
public double getPrice() - return the price
public void setCount(int num) - set the number of items in inventory to parameter num
public int getCount() - return the count
public void addInventory(int amt) - increase inventory by parameter amt
public void sellInventory(int amt) - decrease inventory by parameter amt
Ex. If a new Product object is created with code set to "Apple", price set to 0.40, and the count set to 3, the output is:

Name: Apple
Price: 0.40
Count: 3
Ex. If 10 apples are added to the Product object's inventory, but then 5 are sold, the output is:

Name: Apple
Price: 0.40
Count: 8
Ex. If the Product object's code is set to "Golden Delicious", price is set to 0.55, and count is set to 4, the output is:

Name: Golden Delicious
Price: 0.55
Count: 4
 */
public class Product {
    private String code;
    private double price;
    private int count;

    public Product(String code, double price, int count){
        this.code = code;
        this.price = price;
        this.count = count;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){return code;}

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){return price;}

    public void setCount(int num) {
        this.count = num;
    }
    public int getCount() {return count;}

    public void addInventory(int amt){
        this.count += amt;
    }

    public void sellInventory(int amt){
        this.count -= amt;
    }
}
