package ec.edu.espoch.bank.daointerface;

public interface DaoSavingAccounts {
    
    public boolean deposit(float value);
    public boolean withdraw(float value);
    public boolean monthlyStatement();
    public void print();
}
