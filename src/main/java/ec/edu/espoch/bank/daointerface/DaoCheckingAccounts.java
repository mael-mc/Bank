
package ec.edu.espoch.bank.daointerface;

import ec.edu.espoch.bank.objects.CheckingAccount;


public interface DaoCheckingAccounts {
    
    public boolean deposit(CheckingAccount checkingAccount, float value);
    
    public boolean withdraw(float value);
    
    public boolean monthlyStatement();
    
    public void print();
}
