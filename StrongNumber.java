public class StrongNumber {

  static int recursiveFact(int num){
    if(num ==0)return 1;
    int fact = recursiveFact(num -1);
    return num * fact;
  }


  static void isStrongNumber(int num , int copy , int ans){
    if(num == 0){
      if(copy == ans){
        System.out.println("The Number is Strong Number");
      }else{
        System.out.println("The Number is Not Strong Number");
      }
      return;
    }
    ans += recursiveFact(num%10);
    isStrongNumber(num / 10, copy, ans);
  }
  public static void main(String[] args) {
    int num = 145;
    isStrongNumber(num, num, 0);

  }
  
}
