interface AccountManagement {
    void openAccount(String accountHolder);

    void closeAccount();
}

interface TransactionProcessing {
    void deposit(double amount);

    void withdraw(double amount);

    double checkBalance();
}

interface CustomerService {
    void provideCustomerSupport();
}

class BankAccount implements AccountManagement, TransactionProcessing, CustomerService {
    private String accountHolder;
    private double balance;

    public void openAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        System.out.println("Account opened for :" + accountHolder);
    }

    public void closeAccount() {
        System.out.println("Account closed for " + accountHolder);
        accountHolder = null;
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " Withdrawl. Current balance: " + balance);
        } else {
            System.out.println(" Insufficient balance.");
        }

    }

    public double checkBalance() {
        System.out.println("Current balance is: " + balance);
        return balance;
    }

    public void provideCustomerSupport() {
        System.out.println("Customer support is available 24/7");
    }
}

public class Bank_App {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.openAccount("Rahul tyagi");

        account.deposit(50000);
        account.withdraw(20000);
        account.checkBalance();

        account.provideCustomerSupport();
        account.closeAccount();
    }
}
