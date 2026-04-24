
package ec.edu.espoch.bank.datasource;

import ec.edu.espoch.bank.objects.Account;

public class Accounts {
    
    public boolean deposit(Account account, float value){
        
        float newBalance = account.getBalance()+value;
        account.setBalance(newBalance);
        return true;
    }
    public boolean withdraw(Account account, float value){
        boolean resp = true;
        if(account.getBalance()>value){
        float newBalance = account.getBalance()-value;
        account.setBalance(newBalance);   
        resp = true;
        }
        return resp;
    }
    private float calculateInteres(){
        
        return 0.0F;
    }
    public boolean monthlyStatement(){
        
        return true;
    }
    public void print(Account account){
        
        System.out.println("Saldo" + account.getBalance());
        System.out.println("Numero Depositos: "+ account.getNumberDeposit());
        System.out.println("Numero de Retiros: "+ account.getNumberWithdrawals());
        System.out.println("Tasa de Interes Anual: "+ account.getAnnualInterestRate());
        System.out.println("Tarifa Mensual: "+ account.getMonthlyFee());
    }
}
