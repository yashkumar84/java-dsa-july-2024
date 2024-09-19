public class Recursion {

  static void printName(int n){
    if(n <= 0){
      return;
    }
    System.out.println("Yash");
    printName(n - 1);
  }
  public static void main(String[] args) {
      printName(5);
  }
  
}
