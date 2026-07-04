public class Call_by_Value_with_function04 {

    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a+" b ="+b);
    }
    public static void main(String arg[]){
        int a = 5 ;
        int b = 10;

        Swap(a,b);

        System.out.println("a = "+a+" b ="+b);
        // System.out.println("temp = "+temp); //can not acceses the variable out side the variable
    }
    
}
