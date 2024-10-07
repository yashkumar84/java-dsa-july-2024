public class Fib {
  static int fib(int n){
    if(n < 2) return n;

    int first = fib(n-1);
    int second = fib(n-2);
    return first + second;
  }
  public static void main(String[] args) {
    System.out.println(fib(5));
    
  }
  
}
