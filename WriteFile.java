import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

  public static void main(String[] args) {
    String fileName = "my.txt";
    String content = "jhghjhjhjvvhjhj ";
    
    FileWriter writer = null;
    File file = new File(fileName);
    System.out.println(file.canWrite());
    try{
      writer = new FileWriter(file);
      writer.write(content);
      writer.close();
      System.out.println("File Written SuccessFully");

    }catch(IOException e){
      System.out.println("An Error Occured While Writting the File Please Try again Later");
      e.printStackTrace();
    }
  }
}