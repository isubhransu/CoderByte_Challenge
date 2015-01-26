/*
Have the function BinaryConverter(str) return the decimal form of the binary value. For example: if 101 is passed return 5, 
or if 1000 is passed return 8.
*/
import java.util.*; 
import java.io.*;

class Function {  
  int BinaryConverter(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
              String numstr = ""+num;
          int numl=numstr.length()-1;
          int sum =0;
          
          for(int i=0; i<=numstr.length()-1; i++){
              if(numstr.charAt(i)=='1'){
              sum += Math.pow(2, numl);
              }
              numl--;
          }
          return sum;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.BinaryConverter(s.nextLine())); 
  }   
  
}           

