/* Using the Java language, have the function FirstReverse(str) take the str 
parameter being passed and return the string in reversed order. 
*/

public class HelloWorld{
     public static void main(String []args){
        String str = "codebyte"; 
        System.out.print(FirstReverse(str));
     }
     
public static String FirstReverse(String str) { 
    
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    char[] chararr=str.toCharArray();
    char[] chararr_new=str.toCharArray();
    int offset=str.length()-1;
    for(int i=0; i<str.length(); i++){
           chararr_new[i]=chararr[offset];
           System.out.println(chararr_new[i]);
           offset--;
       }
    String str1 = String.valueOf(chararr_new);
    return str1;
    }
}
