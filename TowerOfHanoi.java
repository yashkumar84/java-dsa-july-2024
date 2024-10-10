public class TowerOfHanoi {
  static void tower(int disk , char fromRod , char auxRod , char toRod){
    if(disk <=0)return;
    tower(disk-1, fromRod, toRod, auxRod);
    System.out.println("Move Dissk " + disk + " From " + fromRod+ " To "  + toRod);
    tower(disk-1, auxRod, fromRod , toRod );

  }
  public static void main(String[] args) {
    int disks = 3;
    tower(disks , 'A','B','C');
  }
}
