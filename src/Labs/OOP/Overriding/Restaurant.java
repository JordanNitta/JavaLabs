package Labs.OOP.Overriding;

public class Restaurant extends Business {
    private int rating;

    @Override
    public String getDescription() {
        return super.getDescription() + "\n  Rating: " + rating;
    }
}
