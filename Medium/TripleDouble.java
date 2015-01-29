/*
Have the function TripleDouble(num1,num2) take both parameters being passed, and return 1 if there is a straight triple of a number 
at any place in num1 and also a straight double of the same number in num2. For example: if num1 equals 451999277 and num2 equals 
41177722899, then return 1 because in the first parameter you have the straight triple 999 and you have a straight double, 99, of 
the same number in the second parameter. If this isn't the case, return 0. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  int TripleDouble(int num1, int num2) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
       
    String nums1=num1+"";
         String nums2=num2+"";
         int i=0;
         int j=0;
         int ic=0;
         int jc=0;
         int sum=0;
         int count=0;
         int count2=0;
         
         for(i=1; i<nums1.length()-1; i++){
             while(nums1.charAt(i)==nums1.charAt(i-1) && i<nums1.length()-1){
                 count++;
                 ic=i;
                 if(i==nums1.length()-1){break;}
                 i++;
             }
         
             if(count==2){break;}
         }
         
         if(count != 2){return 0;}
         for(j=1; j<nums2.length(); j++){
             while(nums2.charAt(j)==nums2.charAt(j-1) && j<nums2.length()-1){
                 count2++;
                 jc=j;
                 if(j==nums2.length()-1){break;}
                 j++;
             }
           if(count2==1 && nums1.charAt(ic)==nums2.charAt(jc)){return 1;}
         }
         return 0;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.TripleDouble(s.nextLine())); 
  }   
  
}           

