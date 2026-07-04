
public class Friends_pairing_03 {
    public static void main(String arg[]){
        System.out.println(friendsPairing(4));

    }

    public static int friendsPairing(int n){
        //base case 
        if(n==1 || n==2){
            return n;
        }

        //Single 
        int fnm1 = friendsPairing(n-1);

        //pair
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;

        //totalWays
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }
    
}
