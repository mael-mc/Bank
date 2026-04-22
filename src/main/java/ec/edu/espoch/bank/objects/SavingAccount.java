
package ec.edu.espoch.bank.objects;

public class SavingAccount extends Account{
    
    protected boolean State;

    public SavingAccount( float balance, float annualInterestRate) {
        super(balance, annualInterestRate);
    }

    public boolean isState() {
        return State;
    }

    public void setState(boolean State) {
        this.State = State;
    }

    @Override
    public float getBalance() {
        return balance;
    }

    @Override
    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public int getNumberDeposit() {
        return numberDeposit;
    }

    @Override
    public void setNumberDeposit(int numberDeposit) {
        this.numberDeposit = numberDeposit;
    }

    @Override
    public int getNumberWithdrawals() {
        return numberWithdrawals;
    }

    @Override
    public void setNumberWithdrawals(int numberWithdrawals) {
        this.numberWithdrawals = numberWithdrawals;
    }

    @Override
    public float getAnnualInterestRate() {
        return annualInterestRate;
    }

    @Override
    public void setAnnualInterestRate(float annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public float getMonthlyFee() {
        return monthlyFee;
    }

    @Override
    public void setMonthlyFee(float monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
    
    
}
