public class Friends_Pairing_Problem_03 {
    public static int friends_pairing(int n){
        // base case
        if(n==1 || n==2){
            return n;
        }

        // choice
        // single
        int fnm1 = friends_pairing(n-1);

        // pair
        int fnm2 = friends_pairing(n-2);

        return fnm1 + (n-1) * fnm2;
    }
    public static void main(String arg[]){
        System.out.println(friends_pairing(4));

    }

    
}
