
package ec.edu.espoch.bank.datasource;


import ec.edu.espoch.bank.daointerface.DaoSavingAccounts;
import ec.edu.espoch.bank.objects.SavingAccount;


public class SavingAccounts extends Accounts implements DaoSavingAccounts{

    public SavingAccounts(SavingAccount savingAccount) {
        if(savingAccount.getBalance()<1000){
            savingAccount.setState(true);
        }
    }
    
    @Override
    public boolean deposit(SavingAccount savingAccount, float value){
        boolean resp = false;
        if(savingAccount.isState()==true){
        resp = super.deposit(savingAccount, value);
        }
        return resp;
    }
    
    @Override
    public boolean withdraw(SavingAccount savingAccount,float value){
        boolean resp = false;
        if(savingAccount.isState()==true){
        resp = super.withdraw(savingAccount, value);
        }
        return resp;
    }
    
    @Override
    public boolean monthlyStatement(){
        return true;
    }
    
    @Override
    public void print(){
        
    }
}
