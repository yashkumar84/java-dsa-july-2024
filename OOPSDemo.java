class Account{
    private int accNumber;
    private String accHolderName;
    private String AccountType;
    private String branchName;
    private int branchCode;
    private int totalTransaction;
    //Default Constructor 
    Account(){
        this.branchCode = 1234;
        this.totalTransaction = 0;
    }
 
    //Parametrized Constructor 
    Account(int accNumber , String accHolderName , String accountType){
        this();
        this.branchName = "Ghaziabad";
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.AccountType = accountType;
    }

    Account(int accNumber ){

    }


    public int transactions(int newTransaction , String transactionType){
        System.out.println("The Current transaction is " + newTransaction);
        this.totalTransaction += newTransaction;
        System.out.println("The Transaction Type Is " + transactionType);
        return this.totalTransaction;
        
    }

    int add(int a , int b){
        return a + b ;
    }

    int add(int a , int b, int c){
        return a + b+ c;
    }

    //Getters


    public int getAccNumber(){
        return this.accNumber;
    }

    public String getAccountHolderName(){
        return this.accHolderName;
    }

    public String getAccountType(){
        return this.AccountType;
    }

    public String getBranchName(){
        return this.branchName;
    }

    //Setters 

    public void setAccountHolderName(String name){
        this.accHolderName = name;
    }
}


//Four Pillars Of oops 
// 1. Inheritance
// 2. Encapsulation
// 3. abstaction
// 4. Polymorphism

//Inheritance 





public class OOPSDemo {
    public static void main(String[] args) {
        //Fan
        //Class 
        //Objects
        Account acc = new Account(1 , "Yash","Saving");
        Account acc1 = new Account(2 , "Aman","Salary");
        System.out.println(acc.getAccountHolderName());
        acc.setAccountHolderName("Aman");
        System.out.println(acc.getAccountHolderName());



    }
    
}
