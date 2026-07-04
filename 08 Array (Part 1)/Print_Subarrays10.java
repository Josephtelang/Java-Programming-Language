import java.util.Arrays;

public class Print_Subarrays10 {
    public static int[] print_Subarray(int numbers[]){
        int sum_of_sub_arrays[] = new int[15];
        int count = 0;
        int ts = 0;
        for (int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for (int j = i ; j < numbers.length ; j++){
                int end = j;
                
                int one_array_sum = 0 ;
                for (int k = start ; k <= end ; k ++){
                    System.out.print(numbers[k]+" ");
                    one_array_sum += numbers[k];
                }
                ts ++;
                sum_of_sub_arrays[count] = one_array_sum;
                count++;
                System.out.println();
            }
            System.out.println();


        }
        System.out.println("Total number of subarrays : "+ts);
        return sum_of_sub_arrays;
    }

    public static void linear_search(int sum_of_sub_arrays[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for (int i = 0 ; i < sum_of_sub_arrays.length ; i++){
            if(sum_of_sub_arrays[i] > largest){
                largest = sum_of_sub_arrays[i];
            }
            if(sum_of_sub_arrays[i] < smallest){
                smallest = sum_of_sub_arrays[i];
            }

        }

        System.out.println("Largest number for sum of the sub arrays is : "+largest);
        System.out.println("Smallest number for sum of the sub arrays is : "+smallest);

       

    }


    
    public static void main(String arg[]){
        int numbers[] = {2,4,6,8,10};

        int sum_of_sub_arrays[] = print_Subarray(numbers);
        System.out.println("ths is the sum of array "+Arrays.toString(sum_of_sub_arrays));

        linear_search(sum_of_sub_arrays);


    }
    
}
