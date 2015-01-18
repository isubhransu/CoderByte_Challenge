/*


Have the function PalindromeTwo(str) take the str parameter being passed and return the string true if the parameter is a palindrome, (the string is the same forward as it is backward) otherwise return the string false. The parameter entered may have punctuation and symbols but they should not affect whether the string is in fact a palindrome. For example: "Anne, I vote more cars race Rome-to-Vienna" should return true. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  Boolean PalindromeTwo(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
            char[] carr = str.toCharArray();
        char[] carr2 = carr;
        int count = str.length()-1;
        for(int i=0; i<str.length(); i++){
            carr2[i]=carr[count];

            count--;
        }
        for(int j=0; j<str.length(); j++){
            if(carr[j]==carr2[j]){
                continue;
            }else{
                return false;
            }
        }
        return true;
       
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.PalindromeTwo(s.nextLine())); 
  }   
  
}           

