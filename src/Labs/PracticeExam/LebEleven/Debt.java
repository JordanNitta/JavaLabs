package Labs.PracticeExam.LebEleven;

public class Debt {
    // TODO: Declare private field - debtRatio
    private double debtRatio;

    // TODO: Define public method - calculateDR()
    public void calculateDR(double totalDebt, double totalAssets){
        debtRatio = totalDebt / totalAssets;
    }

    // TODO: Define public method - getDR()
    public double getDR(){
        return debtRatio;
    }
}
