package Labs.OOP.Inheritance.ExampleOne;

import Labs.OOP.Inheritance.ExampleOne.GenericItem;

public class ProduceItem extends GenericItem {
    private String expirationDate;

    public void setExpiration(String newDate) {
        expirationDate = newDate;
    }

    public String getExpiration() {
        return expirationDate;
    }
}
