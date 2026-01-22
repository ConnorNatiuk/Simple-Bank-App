public class Bank {
    double balance = 0.0;
    double withdrawAmount = 0.0;
    double depositAmount = 0.0;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }
    
    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void resetWithdrawAmount() {
        this.withdrawAmount = 0;
    }

    public void resetDepositAmount() {
        this.withdrawAmount = 0;
    }
}
