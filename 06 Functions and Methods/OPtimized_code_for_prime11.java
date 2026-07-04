
public class OPtimized_code_for_prime11 {
        public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++ ){
            if (n%i==0){
                return false;
            }
        }
        return true;

    }
    public static void main(String arg[]){
        System.out.println(isprime(5));

    }
    
    
}
