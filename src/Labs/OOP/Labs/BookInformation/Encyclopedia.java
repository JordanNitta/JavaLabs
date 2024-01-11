package Labs.OOP.Labs.BookInformation;

public class Encyclopedia extends Book{
    private String edition;
    private int numOfPages;

    public void setEdition(String edition){
        this.edition = edition;
    }

    public void setNumberOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }

    public String getEdition(){return edition;}
    public int getNumberOfPages(){return numOfPages;}

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Pages: " + numOfPages);
    }
}
