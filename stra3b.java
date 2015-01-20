/*
Have the function ABCheck(str) take the str parameter being passed and return the string true if the characters 
a and b are separated by exactly 3 places anywhere in the string at least once (ie. "lane borrowed" would 
result in true because there is exactly three characters between a and b). Otherwise return the string false.

*/
import java.util.*; 
import java.io.*;

class Function {  
  boolean ABCheck(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       char[] carr=str.toCharArray();
      for(int i=0; i<str.length()-4; i++){
      if(carr[i]=='a' && carr[i+4]=='b'){
        return true;
      }else{continue;}
    }
       
    return false;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ABCheck(s.nextLine())); 
  }   
  
}           

