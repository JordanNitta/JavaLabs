package Labs.OOP.ArrayListOfObjects;

public class Business {
    protected String name;
    protected String address;

    public Business() {}

    public Business(String busName, String busAddress) {
        name = busName;
        address = busAddress;
    }

    @Override
    public String toString() {
        return name + " -- " + address;
    }
}
