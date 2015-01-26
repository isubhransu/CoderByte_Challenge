/*
Have the function ArrayAddition(arr) take the array of numbers stored in arr and return the string true if any combination of
 numbers in the array can be added up to equal the largest number in the array, otherwise return the string false. For exampl
e: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because 4 + 6 + 10 + 3 = 23. The array will not be 
empty, will not contain all the same elements, and may contain negative numbers. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  boolean ArrayAddition(int[] arr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
           int max=0;
        int sum =0;
        int i=0;
        for(i=0; i<arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }    
        i=0;
        while(i<arr.length){
            if(arr[i]==max){
                i++;
                continue;}
            sum+=arr[i];
            i++;
        }    
        if(sum==max){return true;}else{return false;}
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ArrayAddition(s.nextLine())); 
  }   
  
}           

