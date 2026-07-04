public class Find_Factorial06 {
    public static int factorial(int n){
        int f = 1;

        for (int i = 1; i<=n; i++){
            f *= i;

        }
        return f;
        
    }
    public static void main(String arg[]){


        System.out.println(factorial(7));

    }
    
}
