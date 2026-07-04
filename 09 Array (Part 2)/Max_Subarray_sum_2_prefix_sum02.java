public class Max_Subarray_sum_2_prefix_sum02{
    public static void Max_Subarray_Sum_prefix_sum(int numbers[]){
        int max_subarray_sum = Integer.MIN_VALUE;
        int count = 0;
        int prefix_array[] = new int[5];
        
        prefix_array[0] = numbers[0];
        for (int i= 1 ; i< numbers.length ; i++){
            prefix_array[i] = prefix_array[i-1] + numbers[i];
        }

        for (int i=0 ; i < numbers.length ; i++){
            int start = i;
            for (int j = 0 ; j < numbers.length ; j++){
                int end = j;

                count = start == 0 ? prefix_array[end] : prefix_array[end] - prefix_array[start - 1];

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

        Max_Subarray_Sum_prefix_sum(numbers);

    }
}