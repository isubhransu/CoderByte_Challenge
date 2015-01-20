/*
Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the 
largest word in the string. If there are two or more words that are the same length, return the first word from 
the string with that length. Ignore punctuation and assume sen will not be empty. 
*/
public class longestReturn{

     public static void main(String []args){
        System.out.println(longestReturn("Hello World"));
     }

     public static String longestReturn(String str){
         char[] carr=str.toCharArray();
         int max=0;
         int maxt=0;
         int start=0;
         int end=0;
         int count=0;
         int j=0;
         
         for(int i=0; i<str.length(); i++){
             while(carr[i]!=' ' && i!=str.length()-1){
                 ++j;
                 max=j-i;
                 ++count;
                 System.out.println("here-1");
             }
             if(max>maxt){
                 start=i;
                 end=j;
                 maxt=max;
             }
             ++count;
             i=count;
              System.out.println("here-1");
          }
          return str.substring(start, end);
     }
}
