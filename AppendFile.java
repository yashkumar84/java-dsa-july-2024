import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
  public static void main(String[] args) {
    String fileName = "my.txt";
    String content = "Hello THis is THe Content to Append in the My.txt File";

    try(FileWriter writer = new FileWriter(fileName ,true)){
      writer.write(content);
      System.out.println("File Append Successfully");
    }catch(IOException e){
      System.out.println("Error iin the Appending File Pleas TRy Again later");
      e.printStackTrace();
    }
  }
  
}
