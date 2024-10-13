class InsufficientFundException extends Exception{
  public InsufficientFundException(String msg){
    super(msg);
  }
}

public class CustomException {

  static boolean checkBalance(int balance) throws InsufficientFundException{
    if(balance <= 0) {
      throw new InsufficientFundException("Funds Are Not Sufficient");
    }
    return true;
  }
  public static void main(String[] args) {
    int funds = -997;
    try{
      System.out.println(checkBalance(funds));
    }catch(InsufficientFundException e){
      System.out.println(e.getMessage());
    }
  }
  
}
