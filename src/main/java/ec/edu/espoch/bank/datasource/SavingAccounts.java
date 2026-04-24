
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoCheckingAccounts;
import ec.edu.espoch.bank.objects.SavingAccount;


public class SavingAccounts extends Accounts implements DaoCheckingAccounts {

    public SavingAccounts(SavingAccount savingAccount) {
        if(savingAccount.getBalance()<1000){
            savingAccount.setState(true);
        }
    }
    
    @Override
    public boolean deposit(float value){
        
        return true;
    }
    
    @Override
    public boolean withdraw(float value){
        return true;
    }
    
    @Override
    public boolean monthlyStatement(){
        return true;
    }
    
    @Override
    public void print(){
        
    }
}
