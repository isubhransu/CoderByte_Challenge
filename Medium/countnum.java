/*
Have the function SimpleMode(arr) take the array of numbers stored in arr and return the number that appears most frequently 
(the mode). For example: if arr contains [10, 4, 5, 2, 4] the output should be 4. If there is more than one mode return the 
one that appeared in the array first (ie. [5, 10, 10, 6, 5] should return 5 because it appeared first). If there is no mode r
eturn -1. The array will not be empty. */

import java.util.*; 
import java.io.*;

class Function {  
  int SimpleMode(int[] arr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
            int count=0;
        int countm=0;
        int mi=0;
        int i=0;

        //System.out.println(arr.length);
        java.util.Arrays.sort(arr);
        //System.out.println(arr);
        for(i=0; i<arr.length-1; i++){
            while(arr[i]==arr[i+1]){
                count++;
                i++;
            }
            if(count>countm){
                countm=count;
                mi=i;
               // System.out.println(i);
            }
            count=0;
        }
    if(mi==0){return -1;}else{
      return arr[mi];}
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SimpleMode(s.nextLine())); 
  }   
  
}           

