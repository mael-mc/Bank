package ec.edu.espoch.bank;

import ec.edu.espoch.bank.datasource.Accounts;
import ec.edu.espoch.bank.objects.Account;

public class Bank {

    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        Account account = new Account(10, 5);
        accounts.print(account);
    }
}
