/*
Have the function DivisionStringified(num1,num2) take both parameters being passed, divide num1 by num2, and 
return the result as a string with properly formatted commas. If an answer is only 3 digits long, return the 
number with no commas (ie. 2 / 3 should output "1"). For example: if num1 is 123456789 and num2 is 10000 the 
output should be "12,345". 
*/

import java.util.*; 
import java.io.*;

class Function {  
  String DivisionStringified(int num1, int num2) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        float res1=0;
        res1=num1/num2/1.0f;
        res1=res1+1;
        int res = (int) Math.ceil(res1);
        String ress = String.valueOf(res);
        if(ress.length()<=3){
            return ress;
        }else{
            return ress.substring(0, ress.length()-3)+","+ress.substring(ress.length()-3, ress.length());
  }
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.DivisionStringified(s.nextLine())); 
  }   
  
}           

