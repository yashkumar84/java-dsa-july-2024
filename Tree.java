public class Tree{
  static void tree(int n){
    if(n <= 0)return;

    System.out.println("Pre Call " + n );
    tree(n-1);
    System.out.println("Mid Call " + n);
    tree(n- 2);
    System.out.println("Post Call " + n);
  }
  public static void main(String[] args) {
    tree(3);
  }
}