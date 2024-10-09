public class MazePathProblem {
  static void mazePaths(int startingRow , int startingCol , int endRow , int endCol , String result  ){
    if(startingRow == endRow && startingCol ==endCol){
      System.out.println(result);
      return;
    }
    if(startingCol > endCol || startingRow > endRow)return;

    mazePaths(startingRow + 1, startingCol, endRow, endCol, result + "V");
    mazePaths(startingRow, startingCol+1, endRow, endCol, result + "H");

  }
  public static void main(String[] args) {
    mazePaths(0, 0, 3, 2, "" );
  }
  
}
