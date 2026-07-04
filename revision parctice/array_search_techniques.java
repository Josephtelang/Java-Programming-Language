
import java.util.*;

public class array_search_techniques {
    public static void main(String arg[]){
        // int arr[] = {4,2,6,1};

        // System.out.println(linear_search(arr,6));

        // int arr[] = {3,5,6,8,9};
        // int key = 0;
        // System.out.println("the index of key is : "+binary_search(arr,key , 0 , arr.length));

        int arr[] = {2,4,6,8,10};
        print_subarray(arr);
    }
    public static int linear_search(int arr[], int key){
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] == key){
                return i;
            }

        }
        return -1;
    }

    public static int binary_search(int arr[] , int key , int low , int high){
        

        while (low<=high){
            int mid = low + (high - low)/2;

            if (arr[mid] == key ){
                return mid;
            }
            else if (key < arr[mid]){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }

        }
        return -1;

    }

    public static void pair_in_arrr(int arr[]){
        int tpc = 0 ;
        for (int i=0 ; i<arr.length ; i++){
            for (int j = i+1 ; j<arr.length ; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tpc ++;
            }
            System.out.println();
        }
        System.out.println("total noumber of pair : "+tpc);
    }

    public static void print_subarray(int arr[]){
        int tsc = 0;
        for (int start = 0 ; start< arr.length ; start++){
            for (int end = start ; end < arr.length ; end++ ){
                for (int k = start ; k <= end ; k ++) {
                    System.out.print(arr[k] + " ");
                }
                tsc ++;
                System.out.println();
            }
            System.out.println();
            
        }
        System.out.println("total no of subarray is : "+tsc);
    }


    
}
