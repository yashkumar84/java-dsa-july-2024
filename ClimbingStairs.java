public class ClimbingStairs {
  static int climb(int n){
    if(n < 2)return 1;
    return climb(n-1) + climb(n-2);
  }
  public static void main(String[] args) {
    System.out.println(climb(100));
  }
}
