import java.io.File;

public class DeleteFile {
  public static void main(String[] args) {
    String fileName = "output.txt";
    File file = new File(fileName);
    
    if(file.delete()){
      System.out.println("File Deleted Succcessfully");
    }else{
      System.out.println("There Is Some Problem In deleting file ");
    }
  }
  
}
