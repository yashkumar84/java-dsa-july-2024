public class SumOfDigits {

  //tail recursion

  static void sumOfDigit(int num , int sum){
    if(num == 0){
      System.out.println("The Sum is " + sum);
      return;
    }
    int rem = num % 10;
    sum += rem;
    sumOfDigit(num/10, sum);
  
  }

  //Head Recursion 

  static int sumOfDigit(int num){
      if(num == 0) return 0;
      // int sum = sumOfDigit(num/10);
      // int rem = num % 10;
      // return sum + rem;
      return num % 10 + sumOfDigit(num/10);
  }
  public static void main(String[] args) {
    int num = 12345;
    // sumOfDigit(num, 0);
    int sum = sumOfDigit(num);
    System.out.println(sum);
  }
  
}
