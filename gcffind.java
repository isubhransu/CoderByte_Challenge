/*
Have the function Division(num1,num2) take both parameters being passed and return the Greatest Common Factor. That is, 
return the greatest number that evenly goes into both numbers with no remainder. For example: 12 and 16 both are divisible 
by 1, 2, and 4 so the output should be 4. The range for both parameters will be from 1 to 10^3. 
*/

import java.util.*; 
import java.io.*;

class Function {  
  int Division(int num1, int num2) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
           int i=1;
         int count=1;
         int num=0;
         if(num1>num2){
             num=num2;
         }else{num=num1;}
        
         while(i<=num){
         while(num1%i==0 && num2%i==0){
             i++;
             count=i;
         }
         i++;
         }
         return count-1;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.Division(s.nextLine())); 
  }   
  
}           

