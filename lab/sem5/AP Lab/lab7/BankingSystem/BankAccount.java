package BankingSystem;

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String toString() {
        return "Account Number: " + accountNumber + "\nAccount Holder: " + accountHolder + "\nBalance: " + balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        try {
            if (amount <= 0) {
                throw new InvalidAmountException();
            }
            balance += amount;
        } catch (InvalidAmountException e) {
            System.out.println("InvalidAmountException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        try {
            if (amount <= 0) {
                throw new InvalidAmountException();
            }
            if (amount > balance) {
                throw new InsufficientFundsException();
            }
            balance -= amount;
        } catch (InvalidAmountException e) {
            System.out.println("InvalidAmountException: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("InsufficientFundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
