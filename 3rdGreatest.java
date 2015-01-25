/*
Have the function ThirdGreatest(strArr) take the array of strings stored in strArr and return the third largest word within 
in. So for example: if strArr is ["hello", "world", "before", "all"] your output should be world because "before" is 6 
letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter 
word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words 
are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain 
letters. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  String ThirdGreatest(String[] strArr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
              String longest = "";
          String second = "";
          String third = "";
          String current = "";
          
          for (int i=0; i<strArr.length-1; i++) {
            current = strArr[i];
            if (current.length() > longest.length()) {
              third = second;
              second = longest;
              longest = current;
            } else if (current.length() > second.length()) {
              third = second;
              second = current;
            } else if (current.length() > third.length()) {
              third = current;
            }
          }
    return third; 
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ThirdGreatest(s.nextLine())); 
  }   
  
}           

