public class EvenOdd {
  static void countEvenOdd(int n,int odd , int even){
    if(n == 0){
      System.out.println("Odd are : " + odd);
      System.out.println("Even Are : " + even );
      return;
    }
    if(n %2 == 0){
      even++;
    }else{
      odd++;
    }
    countEvenOdd(n-1, odd, even);
  }
  public static void main(String[] args) {
    countEvenOdd(20, 0, 0);
  }
  
}
