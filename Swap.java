public class Swap {

  static int countDigit(int num){
    if(num == 0)return 0;
    return 1 + countDigit(num / 10);
  }

  static void swap(int num){
    int digits = countDigit(num);
    int last = num % 10;
    num /= 10;
    int mid = num % (int)Math.pow(10,digits-2); 
    num /= (int)Math.pow(10,digits-2);
    int first = num;
    num = last * (int)Math.pow(10, digits-1) + mid * 10 + first;
    System.out.println(num);
  }
  public static void main(String[] args) {
    int num = 123456;
    swap(num);

  }
  
}
