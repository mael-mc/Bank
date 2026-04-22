
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.daointerface.DaoSavingAccounts;

public class CheckingAccounts extends Accounts implements DaoSavingAccounts{
    
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
