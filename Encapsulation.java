class Hello {
  private int h = 10;
   Hello(int h){
    this.h = 90;
  }

  public  int getH(){
    return this.h;
  }

  
  @Override
  public int hashCode() {
    return 1;
  }
   
   void hello(){
    System.out.println("Print Hello");
  }
}

public class Encapsulation{

  static class Node{

  }
  static void run(){
    System.out.println("Run");
  }
  public static void main(String[] args) {
     Hello h = new Hello(10);
     Hello s = new Hello(20);
     
     System.out.println(h);
     
  }
}