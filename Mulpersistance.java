/*

*/
public class Mulpersistance{

     public static void main(String []args){
        System.out.println(offLineMin(39));
     }
     public int offLineMin(int num){
     int num_p=0;
     String strn =num+"";
     int strl = strn.length();
     int cint=0;
     int cint1=0;
     
     while(strl!=1){
         System.out.println("here1");
       for(int i=0; i<strn.length()-1; i++){
         cint = (int) strn.charAt(i);
         cint1=(int) strn.charAt(i+1);
         num_p = cint*cint1;
         strn=num_p+"";
         strl=strn.length();
         System.out.println("here2");
       }
     }
     return num_p;
     }
     
}

