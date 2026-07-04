import java.util.Scanner;

public class Search_in_rotatedSorted_array_03 {
    public static int search(int arr[], int target ,int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //kaam
        int mid = si + (ei - si)/2;

        // case found 
        if (target == arr[mid]){
            return mid;
        }

        // mid on L1
        if (arr[si]<= arr[mid]){
            // case 1 : search on left of L1
            if(arr[si] <= target  && target < arr[mid]){
                return search(arr,target,si,mid-1);
            }
            else {
                // case 2 : search on right from mid on L1
                return search(arr,target,mid+1,ei);
            }
        }
        else{  // mid on L2
            
            if (arr[mid]< target && target <= arr[ei]){
                // case 1 : search on right side of L2 from mid
                return search(arr,target,mid+1,ei);
            }
            else{
                //case 2 : search on left side from mid on L2
                return search(arr,target,si,mid-1);

            }
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int array[] = {4,5,6,7,0,1,2};
        System.out.println("Enter the number to search its index : ");
        int target = sc.nextInt();

        // System.out.println(search(array,target,0,array.length-1));
        System.out.println(usingLoop(array,target,0,array.length-1));

    }

    public static int usingLoop(int arr[], int target , int si , int ei){
        while(si <= ei){
            // kaam 
            int mid = si + (ei - si)/2;

            if(target == arr[mid]){
                return mid;
            }

            if (arr[si] <= arr[mid]){
                if(arr[si] <= target && target < arr[mid]){
                    ei = mid - 1; 
                }
                else{
                    si = mid + 1;
                }

            }
            else{
                if(arr[mid] < target && target <= arr[ei]){
                    si = mid + 1;
                }
                else{
                    ei = mid - 1;
                }
            }
        }

        return -1;

    }
    
}
