public class If_num_prime_or_not10 {

    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for (int i=2; i<=n-1; i++ ){
            if (n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String arg[]){
        System.out.println(isprime(4));

    }
    
}
