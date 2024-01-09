package Labs.ObjectsAndClassesLab.Labs.ArtworkLabel;

public class Artwork {
    // Declare private fields - title, yearCreated
    private String title;
    private int yearCreated;
    // Declare private field artist of type Artist
    private Artist artist;

    // Default constructor
    public Artwork() {
        title = "unknown";
        yearCreated = -1;
        artist = new Artist(); // Initialize the artist field with the default artist
    }

    // Second constructor to initialize private fields (title, yearCreated, artist)
    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }

    // Get methods
    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    // Define printInfo() method
    // Call the printInfo() method in Artist.java to print an artist's information
    public void printInfo() {
        artist.printInfo(); // Print artist's information using the Artist's printInfo() method
        System.out.println("Title: " + getTitle() + ", " + getYearCreated());
    }
}
