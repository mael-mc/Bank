package ec.edu.espoch.bank.daointerface;

import ec.edu.espoch.bank.objects.SavingAccount;

public interface DaoSavingAccounts {
    
    public boolean deposit(SavingAccount savingAccount, float value);
    public boolean withdraw(SavingAccount savingAccount, float value);
    public boolean monthlyStatement();
    public void print();
}
