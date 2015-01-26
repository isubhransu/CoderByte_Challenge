/*
Have the function LetterCount(str) take the str parameter being passed and return the first word with the greatest number 
of repeated letters. For example: "Today, is the greatest day ever!" should return greatest because it has 2 e's (and 2 t's) 
and it comes before ever which also has 2 e's. If there are no words with repeating letters return -1. Words will be separated by spaces. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String LetterCount(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
   String strr1[]=str.split(" ");
          String strr[]= strr1;
          String strt="";
          int count=0;
          int count1=0;
          int maxi=0;
          
          for(int i=0; i<strr.length; i++){
              char[] crr=strr[i].toCharArray();
              java.util.Arrays.sort(crr);
              strt=new String(crr);
              for(int j=0; j<strt.length()-1; j++){
                  while(strt.charAt(j)==strt.charAt(j+1) && j<strt.length()-2){
                      count++;
                      j++;
                  }
              }
              if(count>count1){
                  count1=count;
                  maxi=i;
              }
              count=0;
          }
          return strr1[maxi];
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterCount(s.nextLine())); 
  }   
  
}           

