public class my_practice06{
    // paris in reverse order 😂
    public static void pair_of_array(int number[]){
        
        int n = number.length;
        for (int i = 0 ; i<n ; i++){
            for (int j =n-1 ; j > i ; j--){
                System.out.print("("+number[i]+","+number[j]+")");
            }
            System.out.println();
        }
    }

    // Max array sum
    public static void max_subarray_sum_1(int numbers[]){
        int n = numbers.length;
        int max_subarray_sum = Integer.MIN_VALUE;
        int sum_of_subarray = 0;
        int counter = 0 ;

        for (int i = 0 ; i< n ; i++ ){
            int start = i;
            for( int j = i ; j < n ; j ++){
                int end = j;
                sum_of_subarray =0;
                for (int k = start ; k <= end ; k++){
                    sum_of_subarray += numbers[k];
                    

                }
                if (max_subarray_sum < sum_of_subarray){
                        max_subarray_sum = sum_of_subarray;
                    }
                counter ++;
                System.out.println("The sum of sub array "+counter+" is : "+sum_of_subarray);

            }
        }
        System.out.println("The max sub array sum is : "+max_subarray_sum);

    }

    public static void kadans(int number[]){
        int n = number.length;
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int count = 0;
        
        
        for (int i = 0; i<n ; i++){
            cs = cs + number[i];
            if (number[i] < 0){
                count ++;
            }

            if (cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
            
            

            
        }
        
        if (count == number.length){
            ms = Integer.MIN_VALUE;
            for( int i = 0 ; i < n; i++ ){
                ms = Math.max(number[i],ms);

            }

        }
        System.out.print("maximum sum form sum of sub arrays : "+ms);
    }

    public static void trapped_water(int bar[]){
        int n = bar.length;
        int left_max_boundry[] = new int [n];
        int right_max_boundry[] = new int [n];
        
        left_max_boundry[0] = bar[0];
        for (int i = 1; i<n ; i++){
            left_max_boundry[i] = Math.max(left_max_boundry[i-1],bar[i]);
        }

        right_max_boundry[n-1] = bar[n-1];
        for (int i= n-2 ; i>=0; i--){
            right_max_boundry[i] = Math.max(right_max_boundry[i+1],bar[i]);
        }
        
        int total_trapped_water = 0 ;
        for(int i = 0; i<n ; i++){
            int water_level = Math.min(left_max_boundry[i],right_max_boundry[i]);

            total_trapped_water += water_level - bar[i];


        }

        System.out.println("The total water trapped is : "+total_trapped_water);
    }

    public static int sell_and_buy_stocks(int prices[]){
        int n = prices.length;
        int max_profit = 0;
        int buy_price = prices[0];

        for (int i = 1 ; i<n ; i++){
            int sell_price = prices[i];

            int profit = sell_price - buy_price;

            if (profit > max_profit){
                max_profit = profit;
            }

            if (sell_price < buy_price){
                buy_price = sell_price;
            }

        }
        // if (max_profit <= 0){
        //     return 0;         --> no need of this 
        // }

        return max_profit;
    }
    public static void main(String arg[]){
        // int number[] = {1,-2,6,-1,3};  -> for max_subarray_sum
        // pair_of_array(number);

        // max_subarray_sum_1(number);

        // max_sumarray_sum_2_prefix_sum(number);

        // kadans(number);
        
        
        // int bars[] = {4,2,0,6,3,2,5};  -> for trapped water 

        // trapped_water(bars);

        int prices[] = {7,1,5,3,6,4};

        int result = sell_and_buy_stocks(prices);
       
        System.out.println("The maximum profit is : "+ result);







       
    }
    public static void max_sumarray_sum_2_prefix_sum(int numbers[]){
        int n = numbers.length;
        int max_subarray_sum = Integer.MIN_VALUE;
        int subarray_sum = 0;
        int prefix_array[] = new int[n];

        prefix_array[0] = numbers[0];
        for (int i=1; i < n ; i++){
            prefix_array[i] = prefix_array[i-1] + numbers[i];
        }

        for (int i = 0 ; i<n ; i++){
            int start = i;
            for (int j = i ; j<n ; j++){
                int end = j;

                subarray_sum = start==0 ? prefix_array[end] : prefix_array[end] - prefix_array[start-1];

                if (max_subarray_sum < subarray_sum){
                    max_subarray_sum = subarray_sum;
                }
                System.out.println(subarray_sum);
            }
        }
        System.out.println("The max sum form sub array sum is : "+max_subarray_sum);



    }
}