package BankingSystem;

import java.util.HashSet;

public class Bank {
    static int id=0;
    HashSet<BankAccount> accounts= new HashSet<BankAccount>();

    public void addAccount(String accountHolder, double balance) {
        BankAccount account = new BankAccount(id++, accountHolder, balance);
        accounts.add(account);
        System.out.println("Your account number is " + account.accountNumber);
    }

    public void getAccount(int accountNumber) throws AccountNotFoundException{
        try {
            for (BankAccount account : accounts) {
                if (account.accountNumber == accountNumber) {
                    System.out.println(account);
                    return;
                }
            }
            throw new AccountNotFoundException();
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void removeAccount(int accountNumber) throws AccountNotFoundException{
        try {
            for (BankAccount account : accounts) {
                if (account.accountNumber == accountNumber) {
                    accounts.remove(account);
                    return;
                }
            }
            throw new AccountNotFoundException();
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) throws AccountNotFoundException{
        try {
            BankAccount fromAccount = null;
            BankAccount toAccount = null;
            for (BankAccount account : accounts) {
                if (account.accountNumber == fromAccountNumber) {
                    fromAccount = account;
                }
                if (account.accountNumber == toAccountNumber) {
                    toAccount = account;
                }
            }
            if (fromAccount == null || toAccount == null) {
                throw new AccountNotFoundException();
            }
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        } catch (InsufficientFundsException | InvalidAmountException | AccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
