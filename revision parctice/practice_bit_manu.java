public class practice_bit_manu{
    public static void main(String arg[]){
        int a = 5;
        // int b = 3;

        // a = a^b;
        // b = a^b;
        // a = a^b;

        // System.out.println("where the value of 'a' is : "+a+ " and b is : "+b);
        // System.out.println(-(~a));

        char c = 'A';
        System.out.println(upperToLower(c));
    }

    public static char upperToLower(char a){
        int bitmask = 1<<5;
        return (char)(a | bitmask);
    }
}