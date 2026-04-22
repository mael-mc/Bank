
package ec.edu.espoch.bank.daointerface;


public interface DaoCheckingAccounts {
    
    public boolean deposit(float value);
    public boolean withdraw(float value);
    public boolean monthlyStatement();
    public void print();
}
