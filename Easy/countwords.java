/*
Have the function WordCount(str) take the str string parameter being passed and return the number of words 
the string contains (ie. "Never eat shredded wheat" would return 4). Words will be separated by single spaces. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  int WordCount(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
            int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return ++count;

    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.WordCount(s.nextLine())); 
  }   
  
}           

