public class DecimalToBinary {
  static String convert(int num){
      if(num == 0)return "";
      return convert(num/2) + num %2;
  }

  static void convert(int num , String ans){
    if(num == 0){
      System.out.println(ans);
      return;
    }
    int rem = num % 2;
    ans = rem + ans;
    convert(num/2 , ans);
  }
  public static void main(String[] args) {
    int n = 6;
    System.out.println(convert(n));
    convert(n,"");
  }
  
}
