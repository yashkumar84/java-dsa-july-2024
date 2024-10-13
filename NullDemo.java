public class NullDemo {
  public static int divide(int a , int b){
    return a / b;
  }
  public static void main(String[] args) {
    String str = null;
    try{
      System.out.println(divide(10 , 2));
      System.out.println(str.length());
    }catch(NullPointerException e){
      System.out.println(e.getMessage());
    }catch(ArithmeticException e){
      System.out.println(e.getMessage());
    }
  }
  
}
