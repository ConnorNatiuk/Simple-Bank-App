public class Transactions {

    static final double RESET_BALANCE = 0.0;

    double amountWithdrawn = 0.0;
    double amountDeposited = 0.0;

    private final Bank myBank;
    
    public Transactions(Bank myBank) {
        this.myBank = myBank;
    }

    public void withdraw() {
        double withdrawBalance = myBank.getBalance() - myBank.getWithdrawAmount();
        if (withdrawBalance < 0) {
             // PRINT ERROR MESSAGE
             // DON'T CHANGE BALANCE
             return;
        }
        addToAmountWithdrawn(myBank.getWithdrawAmount() + amountWithdrawn);
        myBank.setBalance(withdrawBalance);
        myBank.setDepositAmount(RESET_BALANCE);
    }
    public void deposit() {
        if (myBank.getDepositAmount() <= 0) {
            // PRINT ERROR MESSAGE
            // DON'T CHANGE BALANCE
            return;
        }
        addToAmountDeposited(myBank.getDepositAmount() + amountDeposited);
        double depositBalance = myBank.getBalance() + myBank.getDepositAmount();
        myBank.setBalance(depositBalance);
        myBank.setDepositAmount(RESET_BALANCE);
    }

    public double getAmountDeposited() {
        return amountDeposited;
    }

    public void addToAmountDeposited(double deposit) {
        amountDeposited += deposit;
    }

    public double getAmountWithdrawn() {
        return amountWithdrawn;
    }

    public void addToAmountWithdrawn(double withdraw) {
        amountWithdrawn += withdraw;
    }
}
