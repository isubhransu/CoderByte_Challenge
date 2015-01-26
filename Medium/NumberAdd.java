/*
Using the Java language, have the function NumberSearch(str) take the str parameter, search for all the numbers in the 
string, add them together, then return that final number. For example: if str is "88Hello 3World!" the output should be 91. 
You will have to differentiate between single digit numbers and multiple digit numbers like in the example above. So 
"55Hello" and "5Hello 5" should return two different answers. Each string will contain at least one letter or symbol.
*/
import java.util.*; 
import java.io.*;

class Function {  
  int NumberAddition(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
        int count=0;
        int sub=0;
        int sum=0;
        
        for(int i=0; i<str.length()-1; i++){
            while(str.charAt(i+count)<58 && str.charAt(i+count)>48 && i+count<str.length()-1){
                ++count;
            }
            if(count!=0){
            sub = Integer.parseInt(str.substring(i, i+count));
            sum += sub;
            }
            i = i+count;
            count = 0;
            System.out.println(i+count);
        }
        return sum;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.NumberAddition(s.nextLine())); 
  }   
  
} 
