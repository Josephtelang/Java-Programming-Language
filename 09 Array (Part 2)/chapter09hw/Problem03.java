public class Problem03 {
    public static int max_profit_detector(int price[]){
        int n = price.length;
        int max_profit = 0;
        int buy_price = price[0];
        for (int i = 1 ; i<n ; i++){
            int selling_price = price[i];
            int profit = selling_price - buy_price;

            if(buy_price > selling_price){
                buy_price = selling_price;
            }
            if(max_profit < profit){
                max_profit = profit;
            }
            
        }
        return max_profit;
    }
    public static void main(String arg[]){
        int price[] = {7,1,5,3,6,4};

        System.out.println("The max profit in the array is : "+max_profit_detector(price));
    }
    
}
