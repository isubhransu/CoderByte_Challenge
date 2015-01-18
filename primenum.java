/*
Have the function PrimeMover(num) return the numth prime number. 
The range will be from 1 to 10^4. For example: if num is 16 the 
output should be 53 as 53 is the 16th prime number. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  int PrimeMover(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        int count=0;
        int count2=0;
        for(int num=0; count<numb; num++){
          if(num%2==0 || num%3==0 || num%5==0 || num%7==0 || num ==2 || num ==3 || num ==5 || num ==7){
             ++count;
             System.out.println("here");
             if (count==numb){
                 return num;
             }
          }
        count2 = num;  
        }
        return count2;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.PrimeMover(s.nextLine())); 
  }   
  
}








  
