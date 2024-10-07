public class DecimalTohexaDecimal {
  static  String decimalTohex(int decimal){
    if(decimal == 0)return "";
    int remainder = decimal % 16;
    char hex;
    if(remainder < 10){
      hex = (char)(remainder + '0');
    }else{
      hex = (char)(remainder - 10 + 'A');
    }

    return decimalTohex(decimal / 16) + hex;
  }
  public static void main(String[] args) {
    int num = 320;
  
    
    // System.out.println((char)('0' + 11));
    // //Ans - EB
    // System.out.println(decimalTohex(num));
    System.out.println(num > 320 ? "Num is Greater than 320" : "Num is Less Than or Equals to 320");
    String result = num > 320 ? "Num is Greater than 320" : "Num is Less Than or Equals to 320";
    System.out.println(result);
    


  }
  
}
