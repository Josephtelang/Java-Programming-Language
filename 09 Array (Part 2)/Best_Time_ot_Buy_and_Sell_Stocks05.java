public class Best_Time_ot_Buy_and_Sell_Stocks05 {

    public static int Buy_and_sell_stocks(int prices []){
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0 ; i<prices.length ; i++){
            int selling_price = prices[i];
            if(min_price < selling_price){
                int profit = selling_price - min_price;
                max_profit = Math.max(profit,max_profit);
            }
            else{
                min_price = selling_price;
            }

        }
        return max_profit;
    }
    public static void main(String arg[]){
        int prices[] = {7,1,5,3,6,4};

        System.out.println("The maximun profit in this price of array is : "+Buy_and_sell_stocks(prices));
    }
    
}
