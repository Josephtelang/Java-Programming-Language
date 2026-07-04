public class Call_by_Value_in_java03 {
    public static void main(String arg[]){
        //swap - value exchange
        int a = 5;
        int b = 10;
        
        //swap
        int temp = a;
        a = b;
        b = temp;


        System.out.println("a = "+a+" , b = "+b);
        System.out.println("temp = "+temp);
    }
}
