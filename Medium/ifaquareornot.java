
public class HelloWorld{

     public static void main(String []args){
        System.out.println(powerOf2(12));
     }
     
     public static boolean powerOf2(int num){
         double num1 = num;
         while(num1/2 != 1){
             num1 = num1/2;
             if(num1 == 1 || num1 == 2){return true;}else if (num1 > 3){continue;}else{return false;}
         }
         return false;
     }
}
