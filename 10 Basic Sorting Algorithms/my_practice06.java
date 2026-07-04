import java.util.*;

public class my_practice06 {
    public static void Bubble_sort(int arr[]){
        int count = 0;
        for (int turn =0 ; turn< arr.length-1 ; turn++){
            
            for (int j=0 ; j<arr.length-1-turn; j++){
                if  (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count ++;
                }
            }
        }
        if(count == 0 ){
            System.out.println("The array is already sorted you don't need to sort it ");
        }
    }

    public static void Selection_sort(int arr[]){
        for (int i= 0 ; i<arr.length-1; i++){
            int maxs_index =i;
            for(int j =i ; j< arr.length ; j++){
                if(arr[maxs_index] < arr[j]){
                    maxs_index = j;

                }
            }
            int temp = arr[maxs_index];
            arr[maxs_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Insertion_sort(int arr[]){
        for (int i= 1 ; i< arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev+1]=curr;

        }
    }

    public static void Counting_sort(int arr[]){
        int max_range = Integer.MIN_VALUE;
        int min_range = Integer.MAX_VALUE;
        for (int i = 0 ; i<arr.length ; i++){
            max_range = Math.max(arr[i],max_range);
            min_range = Math.min(arr[i],min_range);
        }
        
        
        int count[] = new int[max_range-min_range+1];
        for (int i = 0 ; i<arr.length ; i++){
            count[arr[i] - min_range]++;
        }
        
        int j = 0;
        for (int i = count.length-1; i>=0; i--){
            while (count[i]>0){
                arr[j] = i+min_range;
                j ++;
                count[i]--;

            }
        }



    }

    public static void print_sorted_array(int arr[]){
        for (int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String arg[])    {
        // Integer arr[] = {5,4,1,3,2};
        // int arr[] = {1,2,3,4,5};
        // Integer arr[] = {5,-2,4,-2,5,3,1,3,2};
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        
        // Bubble_sort(arr);
        // Selection_sort(arr);
        // Insertion_sort(arr);

        // Inbuile sorting 

        // Arrays.sort(arr);

        // Arrays.sort(arr,0,4);

        // Arrays.sort(arr,Collections.reverseOrder());

        // Arrays.sort(arr,0,4,Collections.reverseOrder());

        //Counting sort


        Insertion_sort(arr);
        print_sorted_array(arr);
    }
}
