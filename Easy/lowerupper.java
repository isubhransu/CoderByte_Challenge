/*
Have the function SwapCase(str) take the str parameter and swap the case of each character. For example: if str 
is "Hello World" the output should be hELLO wORLD. Let numbers and symbols stay the way they are. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String SwapCase(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       char[] c=str.toCharArray();
       for(int i=0; i<str.length(); i++){
            if(str.charAt(i)<91){
               c[i] =Character.toLowerCase(str.charAt(i));
            }
            if(str.charAt(i)>91){
               c[i]=Character.toUpperCase(str.charAt(i));
            }
        }
        str = String.valueOf(c);
        return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SwapCase(s.nextLine())); 
  }   
  
}           


