public class problem02_practice_session {
    public static int binary_search_on_rotated_sorted_array(int arr[],int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid  = low + (high -low)/2;
            
            if (target == arr[mid]){
                return mid;
            }
            // If duplicates make it impossible to decide
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {  //<-- form chat gpt for makeing more efficient 
                low++;
                high--;
            }
            else if (arr[mid] >= arr[low]){
                if(target >= arr[low] && target <= arr[mid]){
                    high = mid -1 ;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if (target>= arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid ;
                }
            }
            
        }
        return -1;
    }
    public static void main(String arg[]){
        int arr[] = {2, 2, 2, 3, 2};

        int target = 3; 

        System.out.println(binary_search_on_rotated_sorted_array(arr, target));

    }
    
}
