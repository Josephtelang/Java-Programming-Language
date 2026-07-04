public class Rotated_and_Sorted_array_search_03 {
    public static int search(int arr[], int target , int si , int ei){
        //base case
        if (si>ei){
            return -1;
        }

        //kaam
        int mid = si + (ei - si)/2;
        
        //case found
        if (arr[mid]==target){
            return mid;
        }

        if (arr[mid]>= arr[si]){ //mid on L1
            if (arr[si]<= target && target <= arr[mid]){  // L1 Left search
                return search(arr,target,si,mid-1);
            }
            else{
                return search(arr,target,mid+1,ei);  //whole array Right search
            }
        }
        else { //mid on L2
            if (arr[mid]<= target && target <= arr[ei]){ // L1 Right search
                return search(arr, target,mid+1,ei);
            }
            else{
                return search(arr, target,si,mid-1); //whole array Left search 
            }

        }


    }
    public static void main(String arg[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    
}
