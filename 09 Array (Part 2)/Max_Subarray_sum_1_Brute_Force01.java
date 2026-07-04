public class Max_Subarray_sum_1_Brute_Force01{
    public static void max_Subarray_Sum(int numbers[]){
        int max_subarray_sum = Integer.MIN_VALUE;
        int count = 0;

        for(int i= 0; i < numbers.length ; i++){
            int start = i;
            for(int j = i ; j < numbers.length ; j++){
                int end = j;
                count = 0;
                for(int k=start ; k <= end ; k++){
                    count += numbers[k];
                }
                if (max_subarray_sum < count){
                    max_subarray_sum = count;
                }
                System.out.println(count);
            }
        }
        System.out.println("The maximum subarray sum is : "+max_subarray_sum);
    }
    public static void main(String arg[]){
        int numbers[] = {1,-2,6,-1,3};

        max_Subarray_Sum(numbers);
    }
}