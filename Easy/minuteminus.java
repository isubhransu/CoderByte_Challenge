/*
Have the function CountingMinutesI(str) take the str parameter being passed which will be two times (each properly formatted with a 
colon and am or pm) separated by a hyphen and return the total number of minutes between the two times. The time will be in a 12 
hour clock format. For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should 
be 1320. 
*/

import java.util.*; 
import java.io.*;

class Function {  
  int CountingMinutesI(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
            int count=0;
        String before="";
        String after="";
        int hour=0;
        int minute=0;
        int minute1=0;
        int minute2=0;
        int i=0;
                
        while(str.charAt(i)!='-'){
            count++;
            i++;
        }
        before = str.substring(0, count);
        after = str.substring(count+1);
        count=0;
        
        while(before.charAt(count)!=':'){
            count++;
        }
        hour= Integer.parseInt(before.substring(0, count));
        
        if(before.charAt(before.length()-2)=='p'){
            hour = hour+12;
        }
        
        minute= Integer.parseInt(before.substring(count+1, before.length()-2));
        minute1 = hour*60+minute;
        
        
        
        while(after.charAt(count)!=':'){
             count++;
        }
        hour= Integer.parseInt(after.substring(0, count));
        if(after.charAt(after.length()-2)=='p'){
            hour = hour+12;
        }
        minute= Integer.parseInt(after.substring(count+1, after.length()-2));
        minute2=hour*60+minute;
        i=minute2-minute1;
        if(i<0){
            return 60*24+i;
        }
        return i;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.CountingMinutesI(s.nextLine())); 
  }   
  
}           

