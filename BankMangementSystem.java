//A user Can create its Account
//A User Can deposit Money
//A User Can withdraw money
//A User Can its Transaction History
//A User Can Check its Details
//A User Can Delete Account
//A user Can change its Pin
//A User can transfer money From one Account To Another
//Check all Acccounts

// Account -- Account Holder Name , Account Number , Account Pin , Balance  , matchPin 
// Bank -  createAccount , DeleteAccount , TransferMoney , WithdrawMoney , DepositMoney , CheckDetails ,fetchAllBankAccounts

import java.util.ArrayList;
import java.util.Scanner;

class Account{
  private String accountHolderName;
  private int accountNumber;
  private double balance;
  private int pin;
  private ArrayList<String> transactionHistory;

  Account(String accountHolderName , int accountNumber , double initialBalance , int pin){
      this.accountHolderName = accountHolderName;
      this.accountNumber = accountNumber;
      this.balance = initialBalance;
      this.pin =  pin;
      this.transactionHistory = new ArrayList<>();
      this.transactionHistory.add("Initial deposit " + initialBalance);
  }

  public String getAccountHolderName(){
    return this.accountHolderName;
  }

  public int getAccountNumber(){
    return this.accountNumber;
  }

  public double getBalance(){
    return this.balance;
  }

  public void setPin(int pin){
    this.pin = pin;
  }

  public boolean matchPin(int pin){
    return this.pin == pin;
  }

  public void deposit(double amount){
    if(amount > 0){
      balance += amount;
      transactionHistory.add("Balance Deposit : "+ amount);
      System.out.println("Balance Dposit SuccessFull");
    }else{
      System.out.println("Deposit unsuccessfull Due to Invalid balance");
    }
  }

  public void  withdraw(int amount){
    if(amount > 0 && amount <= balance){
      balance -= amount;
      transactionHistory.add("Balance Withdraw " + amount);
      System.out.println("Balance WithDraw SuccessFull");
    }else{
      System.out.println("Can not Withdraw Due to Invalid Money Or Insufficient balance");
    }
  }

  public boolean transfer(Account toAccount , double amount){
    if(amount > 0 && amount <= balance){
      balance-=amount;
      transactionHistory.add("Transfer Balance " + amount + "To " + toAccount.getAccountHolderName() );
      toAccount.balance += amount;
      toAccount.transactionHistory.add("Recieved Balance " + amount + " From " + accountHolderName);
      System.out.println("Amount Transfer SuccessFull");
      return true;
    }else{
      System.out.println("Invalid Or Insufficient Balance");
      return false;
    }
  }
  @Override
  public String toString(){
    return ("Account Number " + this.accountNumber + "Account Holder name: " + accountHolderName + "Balance: " + balance);
  }

  public void showAccountTransactionHistory(){
    System.out.println("Transaction History : ");
    for(String transaction : transactionHistory){
      System.out.println(transaction);
    }
  }
}

class Bank{
  ArrayList<Account> accounts;
  Bank(){
    accounts = new ArrayList<>();
  }

  public void createAccount(String accountHolderName ,int accountNumber , double initialBalace , int pin){
    Account account = new Account(accountHolderName, accountNumber, initialBalace, pin);
    accounts.add(account);
    System.out.println("Account Cretaed SuccessFully");
  }

  public Account findAccount(int accNumber){
      for(Account account : accounts){
        if(account.getAccountNumber() == accNumber)return account;
      }
      return null;
  }

  public void deleteAccount(int accountNumber){
    Account account = findAccount(accountNumber);
    if(account != null){
      accounts.remove(account);
      System.out.println("Delete Account SuccessFully");
    }else{
      System.out.println("Can Not Delete Account");
    }
  }


  public void showAllAccount(){
    if(accounts.isEmpty()){
      System.out.println("No Acccount Exists");
      return;
    }

    for(Account account : accounts){
      System.out.println(account);
    }
  }

}

public class BankMangementSystem{
  private static Bank bank = new Bank();
  private static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    boolean exit = false;
    while(!exit){
      int choice;
      System.out.println("Press 1 for Create Account");
      System.out.println("Press 2 For delete Account ");
      System.out.println("Press 3 for deposit Money ");
      System.out.println("Press 4 for withdraw Money");
      System.out.println("Press 5 for get All Accounts");
      System.out.println("Press 6 for Check the Transaction History");
      System.out.println("Press 7 For Checking Account details");
      System.out.println("Press 8 for Transfer Money");
      System.out.println("Press 9 For Change the Pin Of Account");
      System.out.println("Press 10 For Check The Balance");
      System.out.println("Press 11 For exit");
      System.out.println("Please Enter Your Choice");
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          createAccount();
          break;
        case 2 :
          deleteAccount();
          break;
        case 3 : 
          deposit();
          break;
        case 4 : 
          withdraw();
          break;
        case 5 : 
          getAllAccounts();
          break;
        case 6:
            transactionHistory();
            break;
        case 7 : 
            checkAccountDetails();
            break;
        
        case 8:
          transferMoney();
          break;
        case 9:
            changePin();
            break;
        case 10:
            checkBalance();
            break;
        case 11:
            exit = true;
            break;
        default:
          System.out.println("Enter the Correct Choice");
          break;
      }
    }
  }
  static void createAccount(){
      System.out.println("Enter Account Holder Name");
      sc.nextLine();
      String accountHolderName = sc.nextLine();
      
      System.out.println("Enter Acccount Number ");
      int accNumber = sc.nextInt();
      System.out.println("Enter Pin ");
      int pin = sc.nextInt();
      System.out.println("Enter Initial Balance ");
      double initialBalance = sc.nextDouble();
      bank.createAccount(accountHolderName, accNumber, initialBalance, pin);
  }

  static Account findAccountByPin(){
    System.out.println("Enter the Account Number ");
    int accNumber = sc.nextInt();
    Account account = bank.findAccount(accNumber);
    if(account != null){
    System.out.println("Enter the Pin");
    int pin = sc.nextInt();
    if(account.matchPin(pin)){
      return account;
    }else{
      System.out.println("Invalid Pin");
      return null;
    }
  }else{
    System.out.println("Account Not Found");
  }

  return null;
    
  }

  static void deposit(){
    Account account = findAccountByPin();
    if(account != null){
    System.out.println("Enter Amount For Deposit ");
    double amount = sc.nextDouble();
    account.deposit(amount);
    }else{
      System.out.println("Invalid Credentials");
    }
  }

  static void transactionHistory(){
    Account account= findAccountByPin();
    if(account != null){
      account.showAccountTransactionHistory();
    }

  }

  static void checkAccountDetails(){
    Account account= findAccountByPin();
    if(account != null){
     System.out.println(account);
    }
  }

  static void getAllAccounts(){
    bank.showAllAccount();
  }

  static void deleteAccount(){
    Account account= findAccountByPin();
    if(account != null){
     bank.deleteAccount(account.getAccountNumber());
    }
  }

  static void withdraw(){
    Account account= findAccountByPin();
    if(account != null){
      System.out.println("Enter the Amount To Withdraw : ");
      int amount = sc.nextInt();
      account.withdraw(amount);
    }
  }

  static void transferMoney(){
      Account fromAccount = findAccountByPin();
     
      if(fromAccount != null ){
        System.out.println("Enter the account Number of Reciever : ");
        int toacc = sc.nextInt();
        Account toAccount = bank.findAccount(toacc);
        if(toAccount ==null){
          System.out.println("Can Not Transfer Money Because Reciever Account Number is Not Correct");
          return;
        }
        System.out.println("Enter Amount To Transfer: ");
        double amount = sc.nextDouble();
        boolean isTransfer = fromAccount.transfer(toAccount, amount);
        if(isTransfer){
        System.out.println("Money transfer from " + fromAccount.getAccountHolderName() +"'s Account to "+ toAccount.getAccountHolderName() + "'s Account" );
        }
      }else{
        if(fromAccount == null){
          System.out.println("You Dont Have Any Account");
        }
      }
  }

  static void changePin(){
    Account account= findAccountByPin();
    if(account != null){
      System.out.println("Enter New Pin : ");
      int newPin = sc.nextInt();
      account.setPin(newPin);
      System.out.println("New Pin Set SuccessFully");
    }
  }


  static void checkBalance(){
    Account account= findAccountByPin();
    if(account != null){
      System.out.println("The Balance is: "+account.getBalance());
    }
  }
}

