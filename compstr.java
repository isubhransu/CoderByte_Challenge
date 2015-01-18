import java.util.Arrays;

public class compstr{

     public static void main(String []args){
        String str1="abc";
        String str2="bca";
        System.out.println(compstr(str1, str2));
     }
     
     public static char[] compstr(String str1, String str2){ 
        char[] carr1=str1.toCharArray();
        char[] carr2=str2.toCharArray();
        return carr2[1];
        
      
}
}
