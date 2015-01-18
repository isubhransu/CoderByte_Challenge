public class clumpcount{
     public static void main(String []args){
         int mrr[]=new int[]{1, 2, 2, 3, 4, 4};
        System.out.println(clumpCount(mrr));
     }
     public static int clumpCount(int[] mrr){
         int count=0;
         for(int i=0; i<mrr.length-1; i++){
             if(mrr[i]==mrr[i+1]){
                 count++;
                 i = clumpEnds(i, mrr);
             }
         }
        return count; 
     }
     public static int clumpEnds(int i, int[] mrr){
         while(mrr[i]==mrr[i+1]){
             ++i;
             if(i == mrr.length-1){
                 break;
             }
         }
        return i; 
     }
}
