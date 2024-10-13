public class Throwing {
  static boolean checkAge(int age) {
    if(age < 18 ){
      throw new IllegalArgumentException("Age is Less Than 18");
    }

    return true;
  }
  public static void main(String[] args) {
    int age = 19;
    try{
    System.out.println(checkAge(age));
    }catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
  }
  
}
