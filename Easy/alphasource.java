
/*
Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with the letters 
in alphabetical order (ie. hello becomes ehllo). Assume numbers and punctuation symbols will not be included in the 
string.
*/

import java.util.*; 
import java.io.*;

class Function {  
  String AlphabetSoup(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
            char[] carr1 = str.toCharArray();
        char[] carr2 = carr1;
        
        int offset=str.length();
        int min=0;
        int min_c=0;
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<offset; j++){
                if(carr1[j]<min){
                    carr2[i]=carr1[j];
                }
            str.deleteCharAt(j);
            }
        }
        String str1 = String.valueOf(carr2);
        return str1;
      
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.AlphabetSoup(s.nextLine())); 
  }   
  
}           

