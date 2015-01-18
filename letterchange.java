 /* Using the Java language, have the function LetterChanges(str) take the str parameter 
being passed and modify it using the following algorithm. 

Replace every letter in the string with the letter following it in the alphabet 
(ie. c becomes d, z becomes a). Then capitalize every vowel in this new string 
(a, e, i, o, u) and finally return this modified string. 
*/

public class HelloWorld{
     public static void main(String []args){
        String str = "codebyte"; 
        System.out.print(LetterChanges(str));
     }
     
public static String LetterChanges(String str) { 
    
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    char[] chararr=str.toCharArray();
    for(int i=0; i<str.length(); i++){
        int ascii = (int) chararr[i];
        ++ascii;
        if(ascii-1>=97 && ascii-1<122){
          char c=(char)ascii;
          chararr[i]=c;
        }else {
         if(ascii==122){
            chararr[i]='z'; 
         }   
        }
        if(chararr[i]=='a'){
            chararr[i]='A';
        }else{
        if(chararr[i]=='e'){
            chararr[i]='E';
        }else{
        if(chararr[i]=='o'){
            chararr[i]='O';
        }else{
        if(chararr[i]=='u'){
            chararr[i]='U';
        }else{
        if(chararr[i]=='i'){
        chararr[i]='I';
        }
        }    
        }    
        }
        }
    }
    
    
    //Make it to the next char
    
    
    String str1 = String.valueOf(chararr);
    return str1;
    }
}
