public class Prime_in_range12 {
    public static boolean isprime(int n){
        // if (n == 2){
        //     return true;
        // }
        for (int i = 2; i<=n-1; i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }

    public static void prime_in_range(int n){
        for (int i = 2; i<=n; i++){
            if (isprime(i)){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }
    public static void main(String arg[]){
        prime_in_range(100);

    }
    
}
