/*
Have the function AdditivePersistence(num) take the num parameter being passed which will always be a positive integer and 
return its additive persistence which is the number of times you must add the digits in num until you reach a single digit. 
For example: if num is 2718 then your program should return 2 because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.

*/
import java.util.*; 
import java.io.*;

class Function {  
  int AdditivePersistence(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
             int sum=0;
         String numstr="";
         
         while(num>9){
             
             numstr = num+"";
             for(int i=0; i<numstr.length(); i++){
                 sum += Integer.parseInt(""+numstr.charAt(i));
             }
             num=sum;
             sum=0;
         }
         return num;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.AdditivePersistence(s.nextLine())); 
  }   
  
}           

