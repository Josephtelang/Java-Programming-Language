import java.util.*;

public class my_practice_04 {
    public static void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    public static void merge_sort(int arr[], int si , int ei){
        if (si>=ei){
            return;
        }

        int mid = si + (ei - si)/2;

        merge_sort(arr,si,mid);
        merge_sort(arr,mid+1,ei);

        merge(arr,si,mid,ei);

    }

    public static void merge(int arr[],int si, int mid , int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        
        while(i<=mid && j<=ei){
            if (arr[i] <= arr[j]){
                temp[k] = arr[i] ;
                i++; k++;
            }
            else {
                temp[k] = arr[j];
                j++; k++;

            }
        }



        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(k =0 , i = si ; k<temp.length ; k++ , i++){
            arr[i] = temp[k];

        }
 
    }
    public static void main(String arg[]){
        int arr[] = {6,3,9,5,8,-2,2,8}; 
        // merge_sort(arr,0,arr.length-1);
        // printArray(arr);

        // quick_sort(arr,0,arr.length-1);
        // printArray(arr);

        int target = 2;
        int arr1[] = {4,5,6,7,0,1,2};
        // System.out.println(search_in_rotated_sorted(arr1,0,arr1.length-1,target));
        System.out.println(search_using_while_loop(arr1,0,arr1.length-1,target));

    }

    public static void quick_sort(int arr[] , int si , int ei){
        if (si>=ei){
            return;
        }

        int pivot_index = partition(arr, si , ei);
        quick_sort(arr , si , pivot_index-1);
        quick_sort(arr , pivot_index +1 , ei);
    }

    public static int partition(int arr[] , int si , int ei){
        int pivot = arr[ei];
        int i = si-1;
        

        for (int j = si ; j < ei ; j++){
            if (arr[j] <= arr[ei]){
                i++;
                //wap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static int search_in_rotated_sorted(int arr[] , int si , int ei, int target){
        if (si > ei){
            return -1;
        }

        int mid = si + (ei - si)/2;

        if (target == arr[mid]){
            return mid;

        }
        if(arr[si] <= arr[mid]){
            if (arr[si]<= target && arr[mid]> target){
                return search_in_rotated_sorted(arr, si, mid-1, target);

            }
            else{
                return search_in_rotated_sorted(arr, mid+1, ei, target);
            }
        }
        else{
            if ( arr[ei]>=target && arr[mid]<target){
                return search_in_rotated_sorted(arr, mid+1, ei, target);
            }
            else{
                return search_in_rotated_sorted(arr, si, mid-1, target);
            }
        }

    }

    public static int search_using_while_loop(int arr[], int si , int ei , int target){
        

        while(si<=ei){
            int mid = si + (ei-si)/2;
            if (arr[mid] == target){
                return mid;
            }
            if(arr[si]<=arr[mid]){
                if(arr[si]<= target && arr[mid]>=target){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            else{
                if(arr[ei]>=target && arr[mid]<=target){
                    si= mid+1;
                }
                else{
                    ei = mid -1;
                }
            }


        }

        return -1;
    }
    
}
