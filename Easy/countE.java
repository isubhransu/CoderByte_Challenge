/*
Have the function OffLineMinimum(strArr) take the strArr parameter being passed which will be an array of integers ranging 
from 1...n and the letter "E" and return the correct subset based on the following rules. The input will be in the following 
format: ["I","I","E","I",...,"E",...,"I"] where the I's stand for integers and the E means take out the smallest integer 
currently in the whole set. When finished, your program should return that new set with integers separated by commas. For 
example: if strArr is ["5","4","6","E","1","7","E","E","3","2"] then your program should return 4,1,5. 
*/

import java.util.*; 
import java.io.*;

class Function {  
  String OffLineMinimum(String[] strr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        String str="";
        int i=0;
        char min='z';
        String minstr="";
        int min_c=0;
        int count=0;
        
        for(i=0; i<strr.length-1; i++){
        if(i>=strr.length-1){
            return minstr;
        }    
        while(strr[i]!="E"){
            str+=strr[i];
            i++;
        }
        
        //System.out.println(str);
        for(int j=0; j<str.length()-1; j++){
            if(str.charAt(j)<min){
                min = str.charAt(j);
                min_c = j;
            }
        }
        min='z';
        //System.out.println(str.charAt(min_c));
        if(count==0){
            minstr=""+str.charAt(min_c);
        }else{
         minstr+=","+str.charAt(min_c);   
        }
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(min_c);
        str=sb.toString();
        count++;
     }
     return minstr;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.OffLineMinimum(s.nextLine())); 
  }   
  
}           

