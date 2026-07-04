import java.util.*;

public class Quick_Sort_02 {
    public static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_Sort(int arr[], int si , int ei){
        //base case
        if (si>=ei){
            return;
        }

        //kaam
        int pivot_index = partition(arr, si , ei);
        quick_Sort(arr,si,pivot_index-1); //left half 
        quick_Sort(arr, pivot_index+1 , ei); //right half

    }

    public static int partition(int arr[], int si ,int ei){
        int pivot = arr[ei];
        int i = si-1;  // to make place for elements smaller than pivot

        for ( int j= si ; j<ei ; j++){  // after doing j<=ei adds one extra comparsion for each partition
            if (arr[j]<= arr[ei]){
                i++;
                //Swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i]= temp;
        return i;



    }
    public static void main(String arg[]){
        int arr[] = {6,3,9,-2,9,8,2,5};
        quick_Sort(arr,0,arr.length-1);
        printArray(arr);
    }
    
}
