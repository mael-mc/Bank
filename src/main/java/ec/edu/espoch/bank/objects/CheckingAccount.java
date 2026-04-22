
package ec.edu.espoch.bank.objects;

public class CheckingAccount extends Account{
    
    protected float overdraft = 0;
    
    public CheckingAccount(float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getNumberDeposit() {
        return numberDeposit;
    }

    public void setNumberDeposit(int numberDeposit) {
        this.numberDeposit = numberDeposit;
    }

    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public float getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    
    
    
}
