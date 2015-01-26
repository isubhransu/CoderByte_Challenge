/*
Have the function ArrayAdditionI(arr) take the array of numbers stored in arr and return the string true if 
any combination of numbers in the array can be added up to equal the largest number in the array, otherwise 
return the string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true 
because 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements, and may 

contain negative numbers. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  boolean ArrayAdditionI(int[] arr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
            int val=0; 
        for(int i=0; i<arr.length-1; i++){
            if(val<arr[i]){
                val=arr[i];
            }
        } 
        int offset=arr.length-1;
        int sum=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<offset; j++){
                if(arr[j]!=val){
                  sum+=arr[j];
                }
            --offset;    
            }
            if(sum==val){return true;}
            else{continue;}
        }
        return false;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ArrayAdditionI(s.nextLine())); 
  }   
  
}           

