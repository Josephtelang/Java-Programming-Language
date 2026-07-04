public class Binary_to_Decimal13 {

    public static void bintodec(int binarynum){
        int bi_num = binarynum;
        int pow = 0;
        int dec = 0;

        while(binarynum>0){
            int last_dig = binarynum%10;
            dec = dec + (last_dig*(int)Math.pow(2,pow));
            pow ++;
            binarynum = binarynum/10;

        }
        System.out.println("Binary is "+bi_num+" who's decimal number is : "+dec);
    }
    public static void main(String arg[]){
        bintodec(111);
        
    }
    
}
