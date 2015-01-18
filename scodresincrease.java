/*Given an array of scores, return true if each score is equal or greater than the 
one before. The array will be length 2 or more.

scoresIncreasing({1, 3, 4})  true
scoresIncreasing({1, 3, 2})  false
scoresIncreasing({1, 1, 4})  true
*/

public class HelloWorld{
     public static void main(String []args){
         int mrr[]=new int[]{1, 3, 2};
        System.out.println(scoresIncreasing(mrr));
     }
     public static boolean scoresIncreasing(int[] mrr){
         for(int i=0; i<mrr.length-1; i++){
             if(mrr[i]<=mrr[i+1]){
                 continue;
             }else{
                 return false;
             }
         }
        return true; 
     }
}

