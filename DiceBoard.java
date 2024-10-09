public class DiceBoard {
  static void allPaths(int startValue , int target , String result){
    if(startValue == target){
      System.out.println(result);
      return;
    }
    if(startValue > target)return;
      for(int dice = 1;dice<=6;dice++){
        allPaths(startValue + dice, target, result+dice);
      }
  }
    
  public static void main(String[] args) {
    allPaths(0 , 10 ,"");
  }
  }
  

