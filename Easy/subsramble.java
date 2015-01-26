/*


Have the function StringScramble(str1,str2) take both parameters being passed and return the string 
true if a portion of str1 characters can be rearranged to match str2, otherwise return the string 
false. For example: if str1 is "rkqodlw" and str2 is "world" the output should return true. Punctuation 
and symbols will not be entered with the parameters. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  boolean StringScramble(String str1, String str2) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
        char[] carr1=str1.toCharArray();
        char[] carr2=str2.toCharArray();
        char[] carrt1=carr1;
        char[] carrt2=carr2;
        
        Arrays.sort(carr1);
        Arrays.sort(carr2);
        
        
        int n = 0;
        int c = 0;
        if(str1.length()>str2.length()){
            n=str2.length();
            carrt1=carr2;
            carrt2=carr1;
        }else if(str1.length()<str2.length()){
            n=str1.length();
            carrt1=carr1;
            carrt2=carr2;
        }else{
            n = str1.length();
            carrt1=carr1;
            carrt2=carr2;
        }

        for(int i=0; i<n; i++){
           if(carrt1[0] != carrt2[i]){
                ++c;
                continue;
        }else{
           break;
        }
        }
        
        for(int i=0; i<n; i++){
            if(carrt1[i]==carrt2[i+c]){
                continue;
            }else if(i==n-1){
                return false;
            }
            else{
                while(carrt1[i]!=carrt2[i+c]){
                   ++c;
                   System.out.println(c);
                }
            }            }
            return true;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.StringScramble(s.nextLine())); 
  }   
  
}           

