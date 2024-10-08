public class RopCutProblem {
  static int maxCut(int n , int a , int b , int c){
    if(n == 0)return 0;
    if(n < 0)return -1;
    int cutA = maxCut(n-a, a, b, c);
    int cutB = maxCut(n-b, a, b, c);
    int cutC = maxCut(n-c, a, b, c);
    int max = Math.max(cutA, Math.max(cutB, cutC));
    if(max == -1){
      return -1;
    }
    return 1 + max;
  }
  public static void main(String[] args) {
    int n = 5;
    int a = 6;
    int b = 7;
    int c = 8;
    System.out.println(maxCut(n , a , b , c));
  }
  
} 
