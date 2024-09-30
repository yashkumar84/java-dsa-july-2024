public class Factorial {
  static int fact(int num){
    int factorial =1;
    for(int i = 1;i<=num;i++){
      factorial =  factorial *i;
    }
    return factorial;
  }

  static int recursiveFact(int num){
    if(num ==0)return 1;
    return num * recursiveFact(num-1);
  }
  public static void main(String[] args) {
    int n = 5;
    System.out.println(fact(n));
    System.out.println(recursiveFact(n));
  }
  
}
