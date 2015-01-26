/*

Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word. Words will be separated by only one space. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String LetterCapitalize(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    char[] chararr = str.toCharArray();
    for(int i=1; i<str.length()-1; i++){
      if(chararr[i-1]==' '){
        int ascii = (int) chararr[i];
        ascii = ascii-32;
        char c=(char)ascii;
        chararr[i] = c;
      }
    }
    String str1 = String.valueOf(chararr);
    return str1;  
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterCapitalize(s.nextLine())); 
  }   
  
}           

