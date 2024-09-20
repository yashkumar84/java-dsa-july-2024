public class Reverse{
  static void reverseNumber(int num , int reverse){
    if(num == 0){
      System.out.println("The reverse of Number is " + reverse);
      return;
    }
    int rem = num % 10;
    reverse = reverse * 10 + rem;
    reverseNumber(num /10, reverse);

  }
  public static void main(String[] args) {
    reverseNumber(12345, 0);
  }
}