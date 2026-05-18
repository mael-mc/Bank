
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoCheckingAccounts;
import ec.edu.espoch.bank.objects.CheckingAccount;

public class CheckingAccounts extends Accounts implements DaoCheckingAccounts {
    
    @Override
    public boolean deposit( CheckingAccount checkingAccount , float value){
        boolean rsp= false;
        if(value>0){
            rsp = super.deposit(checkingAccount, value);
        }
        return rsp;
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
