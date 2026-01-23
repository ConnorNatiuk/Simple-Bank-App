public class Transactions {

    static final double RESET_BALANCE = 0.0;

    // THIS IS FOR A TEST AGAIN

    double amountWithdrawn = 0.0;
    double amountDeposited = 0.0;

    private final Account myAccount;
    
    public Transactions(Account myAccount) {
        this.myAccount = myAccount;
    }

    public void withdraw() {
        double withdrawBalance = myAccount.getBalance() - myAccount.getWithdrawAmount();
        if (withdrawBalance < 0) {
             // PRINT ERROR MESSAGE
             // DON'T CHANGE BALANCE
             return;
        }
        addToAmountWithdrawn(myAccount.getWithdrawAmount() + amountWithdrawn);
        myAccount.setBalance(withdrawBalance);
        myAccount.setDepositAmount(RESET_BALANCE);
    }
    public void deposit() {
        if (myAccount.getDepositAmount() <= 0) {
            // PRINT ERROR MESSAGE
            // DON'T CHANGE BALANCE
            return;
        }
        addToAmountDeposited(myAccount.getDepositAmount() + amountDeposited);
        double depositBalance = myAccount.getBalance() + myAccount.getDepositAmount();
        myAccount.setBalance(depositBalance);
        myAccount.setDepositAmount(RESET_BALANCE);
    }

    public double getAmountDeposited() {
        return amountDeposited;
    }

    private void addToAmountDeposited(double deposit) {
        amountDeposited += deposit;
    }

    public double getAmountWithdrawn() {
        return amountWithdrawn;
    }

    private void addToAmountWithdrawn(double withdraw) {
        amountWithdrawn += withdraw;
    }
}
