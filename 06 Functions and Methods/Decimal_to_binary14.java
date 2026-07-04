public class Decimal_to_binary14 {

    public static void dectobinary(int n){
        int mynum = n;
        int pow = 0;
        int binarynum = 0;

        while(n>0){
            int rem = n%10;
            binarynum = binarynum + (rem * (int)Math.pow(10,pow));
            pow ++;
            n = n/10; 
        }
        System.out.println("Binary form of dec "+mynum+" is = "+binarynum);
    }
    public static void main(String arg[]){
        dectobinary(111);


    }
    
}
