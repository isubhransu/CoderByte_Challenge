/*
Have the function CaesarCipher(str,num) take the str parameter and perform a Caesar Cipher shift on it using the num parameter
 as the shifting number. A Caesar Cipher works by shifting each letter in the string N places down in the alphabet (in this c
ase N will be num). Punctuation, spaces, and capitalization should remain intact. For example if the string is "Caesar 
Cipher" and num is 2 the output should be "Ecguct Ekrjgt". 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String CaesarCipher(String str, int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        char[] crr=str.toCharArray();
            //System.out.println(crr);
            for(int i=0; i<str.length()-1; i++){
                crr[i]=(char)((int) crr[i]+num);
                //System.out.println(crr);
            }
        return String.valueOf(crr);
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.CaesarCipher(s.nextLine())); 
  }   
  
}           

