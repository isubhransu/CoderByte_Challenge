/*
Have the function MeanMode(arr) take the array of numbers stored in arr and return 1 if the mode equals the mean, 0 if they don't 
equal each other (ie. [5, 3, 3, 3, 1] should return 1 because the mode (3) equals the mean (3)). The array will not be empty, 
will only contain positive integers, and will not contain more than one mode.
*/
import java.util.*; 
import java.io.*;

class Function {  
  int MeanMode(int[] arr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        int avg=0;
        int sum=0;
        int count=0;
        int max=0;
        int max_v=0;
        
        for(int i=0; i<numr.length-1; i++){
            sum+=numr[i];
        }
        avg=sum/numr.length;

        java.util.Arrays.sort(numr);
        
        for(int i=0; i<numr.length-1; i++){
            while(numr[i]==numr[i+1]){
                count++;
            }
            if(count>max){
                max=count;
                max_v=numr[i];
            }
            count=0;
        }
        if(max_v==avg){
            return 1;
        }
        else{return 0;}
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.MeanMode(s.nextLine())); 
  }   
  
}           

