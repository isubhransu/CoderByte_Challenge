/*
Have the function Palindrome(str) take the str parameter being passed and return the string true if the 
parameter is a palindrome, (the string is the same forward as it is backward) otherwise return the string 
false. For example: "racecar" is also "racecar" backwards. Punctuation and numbers will not be part of the 
string. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  boolean Palindrome(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
            int offset=str.length()-1;
        for(int i=0; i<offset; i++){
          if(str.charAt(i)==str.charAt(offset)){
              --offset;
              continue;
          }else{return false;}
         }
        return true;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.Palindrome(s.nextLine())); 
  }   
  
}           

