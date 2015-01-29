/*
Have the function CoinDeterminer(num) take the input, which will be an integer ranging from 1 to 250, and return an integer output 
that will specify the least number of coins, that when added, equal the input integer. Coins are based on a system as follows: there 
are coins representing the integers 1, 5, 7, 9, and 11. So for example: if num is 16, then the output should be 2 because you can 
achieve the number 16 with the coins 9 and 7. If num is 25, then the output should be 3 because you can achieve 25 with either 11, 
9, and 5 coins or with 9, 9, and 7 coins. 
*/
import java.util.*; 
import java.io.*;

class Function {  
  int CoinDeterminer(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
         int[] nrr=new int[]{11, 9, 7, 5, 1};
         int count=5;
         int offset=1;
         int ic=0;
         int ik=0;
         int sum=0;
         
         while(count>0){
             for(int i=0; i<count; i++){
                for(int j=ik; j<offset+i; j++){
                 sum+=nrr[j];
                 ic++;
                 if(sum==num){return ic;}else{ik++; continue;}
                }
                if(i==count-1){offset++;}
                sum=0; ic=0; ik=i;
             }
         }
         return 0;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.CoinDeterminer(s.nextLine())); 
  }   
  
}           

