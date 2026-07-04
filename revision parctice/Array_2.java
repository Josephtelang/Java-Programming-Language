import java.util.*;

public class Array_2{
    public static void main(String arg[]){
        int arr[] = {1,-2,6,-1,3};
        // max_subarray_sum(arr);

        // max_subarray_sum_using_prefix_array(arr);

        // int arr2[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane_alg(arr);


    }

    public static void max_subarray_sum(int arr[]){
        int max_sum = Integer.MIN_VALUE;
        

        for (int start =0 ; start< arr.length ; start++){
            for (int end = start ; end < arr.length ; end++){
                int count = 0;
                for ( int k=start ; k<=end ; k++){
                    count += arr[k];

                }
                System.out.println(count);
                if (max_sum < count){
                    max_sum = count;
                }
            }
            System.out.println();
            
        }
        
        System.out.println("max count of Subarray : "+ max_sum);
    }

    public static void max_subarray_sum_using_prefix_array(int arr[]){
        int max_sum = Integer.MIN_VALUE;

        int prefix_arr[] = new int[arr.length];
        prefix_arr[0] = arr[0];
        for (int i = 1 ; i<arr.length ; i++){
            prefix_arr[i] = prefix_arr[i-1] + arr[i];

        for (int si = 0 ; si<arr.length ; si++){
            for (int ei = 0 ; ei<arr.length ; ei++){
                int curr_count = si==0? prefix_arr[ei]:prefix_arr[ei] - prefix_arr[si-1];

                if (max_sum < curr_count){
                    max_sum = curr_count;
                }
                System.out.println(curr_count);
            }

            System.out.println();
            
        }
        System.out.println("max subarray sum is : "+max_sum);
        }
    }

    public static void kadane_alg(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int count = 0;
        
        for (int i = 0 ; i<arr.length ; i++){
            cs = cs + arr[i];

            if ( arr[i] < 0){
                count ++;
            }
            if ( cs < 0){
                cs = 0;
            }

            ms = Math.max(cs, ms);

        }

        if ( count == arr.length){
            for ( int i= 0 ; i<arr.length ; i++){
                ms = Math.max(ms, arr[i]);
            }
        }

        System.out.println("max subarray sum is : "+ ms);


    }
}