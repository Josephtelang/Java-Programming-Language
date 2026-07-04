import java.util.*;

public class Problem05_practice_session_optimize {
    public static void triplate_array(int arr[]){
        Set<List<Integer>> result = new HashSet<>();
        int n = arr.length;
        for ( int i =0 ; i<n-2 ; i++){
            int low = i+1;
            int high = n-1;

            while(low <high){
                int sum = arr[i]+arr[low]+arr[high];

                if (sum==0){
                    List<Integer> triplate = Arrays.asList(arr[i],arr[low],arr[high]);
                    Collections.sort(triplate);
                    result.add(triplate);
                    low++;
                    high--;

                }
                else if (sum<0){
                    low ++;
                }
                else{
                    high --;
                }

            }
        }
        System.out.println("tirplate array of array which sum is zero is : "+result);
    }
    public static void main(String arg[]){
        int arr[] = {-4,-1,-1,0,1,2};
        triplate_array(arr);


    }
    
}
