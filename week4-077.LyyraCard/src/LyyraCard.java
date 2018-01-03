public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return  "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        if (this.balance < 2.5) {
            //do nothing
        } else {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance < 4) {
            //do nothing
        } else {
            this.balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        if (amount < 1) {                 //load a negative or 0 value -> do nothing
        } else if (this.balance + amount >= 150) {
            this.balance = 150;           //if load exceeds max value(150) -> truncate to 150
        } else {
        this.balance += amount;           //if checks are passed, go ahead and add amount to balance
        }
    }
}