/*
Have the function Consecutive(arr) take the array of integers stored in arr and return the minimum number of integers needed to make 
the contents of arr consecutive from the lowest number to the highest number. For example: If arr contains [4, 8, 6] then the output 
should be 2 because two numbers need to be added to the array (5 and 7) to make it a consecutive array of numbers from 4 to 8. 
Negative numbers may be entered as parameters and no array will have less than 2 elements. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  int Consecutive(int[] arr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
             int i=1;
         int sum=0;
         
         java.util.Arrays.sort(arr);
         while(i<arr.length){
            if(arr[i]-arr[i-1]>1){
                sum=sum+arr[i]-arr[i-1]-1;
            }
            i++;
         }
         return sum;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.Consecutive(s.nextLine())); 
  }   
  
}           

