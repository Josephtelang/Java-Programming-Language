package Practice_problem_10;

public class Best_time_to_buy_and_sell_stocks_04 {

    public static int bruteForce(int stocks[]){
        int maxProfit = 0;

        for(int i=0 ; i<stocks.length ;i++){
            int buyStocks = stocks[i];
            for(int j = i+1 ; j<stocks.length ; j++){
                int sellStocks = stocks[j];
                int currProfit  = sellStocks - buyStocks;
                maxProfit = Math.max(currProfit,maxProfit);

            }
        }


        return maxProfit;
    }
    public static int bestTimeToBuyAndSellStocksOptimize1(int stocks[]){
        int buyStocks = Integer.MAX_VALUE;
        int sellStocks = Integer.MIN_VALUE;
        int maxProfit = 0;

        for(int i=0 ; i<stocks.length ; i++){
            if(buyStocks > stocks[i]){
                buyStocks = stocks[i];
                sellStocks = stocks[i];
            }
            else if(sellStocks < stocks[i]){
                sellStocks = stocks[i];
            }
            
            int currProfit = sellStocks - buyStocks;
            maxProfit = Math.max(currProfit,maxProfit);
        }

        return maxProfit;
    }

    public static int bestTimeToBuyAndSellStocksOptimize2(int stocks[]){
        int minSofar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0 ; i<stocks.length ; i++){
            minSofar = Math.min(minSofar,stocks[i]);
            maxProfit = Math.max(maxProfit,stocks[i] - minSofar);
        }

        return maxProfit;
    }
    public static void main(String arg[]){
        int stocks[] = {7, 1, 5, 3, 6,0, 2};
        System.out.println(bruteForce(stocks));
        System.out.println(bestTimeToBuyAndSellStocksOptimize1(stocks));
        System.out.println(bestTimeToBuyAndSellStocksOptimize2(stocks));
    }
    
}
