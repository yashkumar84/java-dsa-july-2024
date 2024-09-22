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
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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

public class BankMangementGUI{
  private static Bank bank = new Bank();
  private static Scanner sc = new Scanner(System.in);
  private static JFrame frame = new JFrame("Bank Management System");
  public static void main(String[] args) {
    frame.setSize(800 , 800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    // frame.setLocationRelativeTo(null);


    placeComponents();
    frame.setVisible(true);

    
    }

    static void placeComponents(){
      JPanel panel = new JPanel();
    // panel.setBounds(120, 200, 300, 300);
    frame.add(panel);
   
        JButton createAccountButton = new JButton("Create Account");
        // createAccountButton.setBounds(100, 200, 100, 100);
        panel.add(createAccountButton);
        createAccountButton.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
            createAccountForm();
            
          }
          
        });


    }

    static void createAccountForm(){
      JFrame createAccountFrame = new JFrame("Create Account");
      createAccountFrame.setSize(400 , 400);
      createAccountFrame.setLocationRelativeTo(null);

      JPanel panel = new JPanel();
      createAccountFrame.add(panel);
      panel.setLayout(null);

      JLabel accountNumberLabel = new JLabel("Enter Account Number");
      accountNumberLabel.setBounds(20, 40, 180, 10);
      panel.add(accountNumberLabel);

      JTextField accountNumberTextField = new JTextField(20);
      accountNumberTextField.setBounds(20 , 60 , 200 , 15 );
     
      panel.add(accountNumberTextField);
      JLabel accountHolderNameLabel = new JLabel("Enter Account Holder Name");
      accountHolderNameLabel.setBounds(20, 80, 200, 10);
      panel.add(accountHolderNameLabel);

      JTextField accountHolderNameTextField = new JTextField(20);
      accountHolderNameTextField.setBounds(20 , 100 , 200 , 15 );

      panel.add(accountHolderNameTextField);
      JLabel accountPinLabel = new JLabel("Enter Account Pin");
      accountPinLabel.setBounds(20, 120, 200, 10);
      panel.add(accountPinLabel);

      JTextField accountPinTextField = new JTextField(20);
      accountPinTextField.setBounds(20 , 140 , 200 , 15 );

      panel.add(accountPinTextField);
      JLabel initialBalanceLabel = new JLabel("Enter Initial Balance");
      initialBalanceLabel.setBounds(20, 160, 200, 10);
      panel.add(initialBalanceLabel);

      JTextField initialBalanceTextField = new JTextField(20);
      initialBalanceTextField.setBounds(20 , 180 , 200 , 15 );

      panel.add(initialBalanceTextField);

        JButton createButton = new JButton("Create");
        createButton.setBounds(20 , 220 , 100 , 40 );
        panel.add(createButton);

        createButton.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent e) {
          int accNumber = Integer.parseInt(accountNumberTextField.getText());
          int pin = Integer.parseInt(accountPinTextField.getText());
          int initialBalance = Integer.parseInt(initialBalanceTextField.getText());
          String accHolderName = accountHolderNameTextField.getText();
          bank.createAccount(accHolderName, accNumber, initialBalance, pin);
          JOptionPane.showMessageDialog(null, "Account Created Successfully");
          createAccountFrame.dispose();
          }
          
        });
     


      createAccountFrame.setVisible(true);
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

