/*


Have the function ArithGeoII(arr) take the array of numbers stored in arr and return the string "Arithmetic" if the sequence follows 
an arithmetic pattern or return "Geometric" if it follows a geometric pattern. If the sequence doesn't follow either pattern return 
-1. An arithmetic sequence is one where the difference between each of the numbers is consistent, where as in a geometric sequence, 
each term after the first is multiplied by some constant or common ratio. Arithmetic example: [2, 4, 6, 8] and Geometric example: [
2, 6, 18, 54]. Negative numbers may be entered as parameters, 0 will not be entered, and no array will contain all the same elements.

*/
import java.util.*; 
import java.io.*;

class Function {  
  String ArithGeoII(int[] intarr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
            int num = 0;
            for(int i=1; i<intarr.length-1; i++){
                 if((intarr[i]-intarr[i-1])==(intarr[i+1]-intarr[i])){
                     if(i==intarr.length-2){
                     return "Arithmetic";
                     }
                     continue;
                 }else{break;}
                 
            }
            num = intarr[1]/intarr[0];
            for(int i=1; i<intarr.length-1; i++){
                if((intarr[i-1]*num==intarr[i])){
                  if(i==intarr.length-2){
                     return "Geometric";
                     }
                     continue;
                 }else{break;}    
            }
            return "-1";
 
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.ArithGeoII(s.nextLine())); 
  }   
  
}           

