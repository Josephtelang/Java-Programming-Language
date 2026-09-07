import java.util.*;

public class Indian_coins_07 {

    static void indianCoins(Integer coins[], int amount){
        Arrays.sort(coins,Collections.reverseOrder());

        int countOfCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<coins.length ; i++){
            while(coins[i] <= amount){
                countOfCoins++;
                ans.add(coins[i]);
                amount -= coins[i];
                
            }
        }

        System.out.println("total (mini) coins used : "+countOfCoins);
        for(int i=0 ; i<ans.size() ; i++){
            System.out.print(ans.get(i)+" ");
        }


    }
    public static void main(String arg[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount for which you want change value : ");
        int amount = sc.nextInt();
        indianCoins(coins, amount);

    }
    
}
