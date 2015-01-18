/*Using the Java language, have the function SimpleSymbols(str) take the str parameter 
being passed and determine if it is an acceptable sequence by either returning the 
string true or false. The str parameter will be composed of + and = symbols with 
several letters between them (ie. ++d+===+c++==a) and for the string to be true each 
letter must be surrounded by a + symbol. So the string to the left would be false. The 
string will not be empty and will have at least one letter. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String SimpleSymbols(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    char[] chararr = str.toCharArray();
    int asciis = (int) chararr[0];
    int asciie = (int) chararr[str.length()-1];
    if(asciis >= 97 && asciis <= 122){
        return false;
    }
    if(asciie >= 97 && asciie <= 122){
        return false;
    }
    for(int i=0; i<str.length()-1; i++){
      int ascii = (int) chararr[i];
      if(ascii >= 97 && ascii <= 122){
        //System.out.println(chararr[i]);  
       if(chararr[i-1] == chararr[i+1] && chararr[i-1]=='+'){
        //System.out.println(chararr[i]); 
        continue;
      }else{
          return false;
      }    
      }
    }
    return true;   
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.SimpleSymbols(s.nextLine())); 
  }   
  
}           

