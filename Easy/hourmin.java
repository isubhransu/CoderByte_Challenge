public class HelloWorld{

     public static void main(String []args){
        int num = 125;
        System.out.println(hourmin(num));
     }
    public static String hourmin(int num){
    double num2;
    long iPart;
    double fPart;
    
    num2 =num/60.0;
    iPart = (long) num2;
    double x = num2 - Math.floor(num2);
    String.valueOf(iPart);
    return String.valueOf(iPart)+":"+String.valueOf(x);
}
}
