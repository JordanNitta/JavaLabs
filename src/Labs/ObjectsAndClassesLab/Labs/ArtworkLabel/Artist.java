package Labs.ObjectsAndClassesLab.Labs.ArtworkLabel;

public class Artist {
    // Declare private fields - artistName, birthYear, deathYear
    private String artistName;
    private int birthYear;
    private int deathYear;

    // Default constructor
    public Artist() {
        artistName = "unknown";
        birthYear = -1;
        deathYear = -1;
    }

    // Second constructor to initialize private fields (artistName, birthYear, deathYear)
    public Artist(String artistName, int birthYear, int deathYear) {
        this.artistName = artistName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;
    }

    // Get methods
    public String getName() {
        return artistName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    // Define printInfo() method
    public void printInfo() {
        if (birthYear == -1) {
            System.out.println("Artist: " + artistName + " (unknown)");
        } else if (birthYear > 0 && deathYear > 0) {
            System.out.println("Artist: " + artistName + " (" + birthYear + " to " + deathYear + ")");
        } else if (birthYear > 0 && deathYear < 0) {
            System.out.println("Artist: " + artistName + " (" + birthYear + " to present)");
        } else {
            System.out.println("Artist: " + artistName + " (unknown)");
        }
    }
}
