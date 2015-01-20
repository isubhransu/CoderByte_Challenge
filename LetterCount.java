/*
Have the function LetterCountI(str) take the str parameter being passed and return the first word with the 
greatest number of repeated letters. For example: "Today, is the greatest day ever!" should return greatest 
because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's. If there are no words with 
repeating letters return -1. Words will be separated by spaces. 
*/

import java.util.*; 
import java.io.*;

class Function {  
  String LetterCountI(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        String[] words = str.split(" ");
        String str_t = "";
        int j=0;
        int count=0;
        int offset=0;
        int max_c=0;
        int i=0;
        
        for(String word: words){
            char[] carr=word.toCharArray();
            Arrays.sort(carr);
            count=0;
            for(j=0; j<carr.length-1; j++){
                if(carr[j]==carr[j+1]){
                ++count;
                }
            }
            if(count>max_c){
                max_c=count;
                offset=i;
            }
            
            if(i==words.length-1 && max_c!=0){
                return words[offset];
            }
            i++;
     }
         return "-1";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterCountI(s.nextLine())); 
  }   
  
}           

