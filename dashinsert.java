/*
Have the function DashInsert(str) insert dashes ('-') between each two odd numbers in str. For example: if str is 454793 the 
output should be 4547-9-3. Don't count zero as an odd number. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String DashInsert(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
             String fstr=str;
         
        for(int i=0; i<str.length()-1; i++){
            if(fstr.charAt(i)%2!=0 && fstr.charAt(i+1)%2!=0){
                fstr= fstr.substring(0, i+1)+"-"+fstr.substring(i+1);
            }
        }
        
        return fstr;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.DashInsert(s.nextLine())); 
  }   
  
}           

