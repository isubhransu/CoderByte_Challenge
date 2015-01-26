/*
Have the function RunLength(str) take the str parameter being passed and return a 
compressed version of the string using the Run-length encoding algorithm. This algorithm
works by taking the occurrence of each repeating character and outputting that number 
along with a single character of the repeating sequence. For example: "wwwggopp" 
would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols. 

*/
import java.util.*; 
import java.io.*;

class Function {  
  String RunLength(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        int count=1;
        int count2=0;
        int i = 1;
        String str1 = "";
        for(i=1; i<str.length(); i++){
           if(str.charAt(i-1)==str.charAt(i)){
                count++;
                if(i == str.length()-1){
                   count2 = count;
                }
                continue;
           }
           String aString = Integer.toString(count);
           str1 = str1+aString+str.charAt(i-1);
           //System.out.println(i);
           count = 1;
        }
        String bString = Integer.toString(count2);
        str1 = str1+bString+str.charAt(i-1);

    return str1;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.RunLength(s.nextLine())); 
  }   
  
}           

