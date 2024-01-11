package Labs.ObjectsAndClassesLab.Labs.BankAccount;

public class BankAccount {
    private String name;
    private double savingAccount;
    private double checkingAccount;

    public BankAccount(String newName, double amt1, double amt2) {
        this.name = newName;
        this.savingAccount = amt1;
        this.checkingAccount = amt2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setChecking(double amt) {
        this.checkingAccount = amt;
    }

    public double getChecking() {
        return checkingAccount;
    }

    public void setSavings(double amt) {
        this.savingAccount = amt;
    }

    public double getSavings() {
        return savingAccount;
    }

    public void depositChecking(double amt) {
        this.checkingAccount += amt;
    }

    public void depositSavings(double amt) {
        this.savingAccount += amt;
    }

    public void withdrawChecking(double amt) {
        if (checkingAccount >= amt) {
            this.checkingAccount -= amt;
        }
    }

    public void withdrawSavings(double amt) {
        if (savingAccount >= amt) {
            this.savingAccount -= amt;
        }
    }

    public void transferToSavings(double amt) {
        if (checkingAccount >= amt) {
            this.checkingAccount -= amt;
            this.savingAccount += amt;
        }
    }
}

