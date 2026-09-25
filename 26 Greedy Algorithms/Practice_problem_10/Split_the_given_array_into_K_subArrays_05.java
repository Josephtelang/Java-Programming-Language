package Practice_problem_10;
import java.util.*;

public class Split_the_given_array_into_K_subArrays_05 {
    public static int splitTheGivenArrayIntoKSubarrays(int arr[] , int K){
        int higherBound = Arrays.stream(arr).sum();
        int lowerBound = Arrays.stream(arr).max().getAsInt();
        int ans = -1;

        while(lowerBound <= higherBound){
            ArrayList<ArrayList<Integer>> subArrays = new ArrayList<>();
            ArrayList<Integer> subArray = new ArrayList<>();
            int mid = lowerBound + (higherBound - lowerBound) / 2;
            
            int sum = 0;
            for(int i=0 ; i<arr.length ; i++){
                if(sum + arr[i]<= mid){
                    subArray.add(arr[i]);
                    sum += arr[i];
                }
                else{
                    if(subArray.size()>0){

                        subArrays.add(subArray);
                    }
                    sum = 0;
                    subArray = new ArrayList<>();
                    subArray.add(arr[i]);
                    sum += arr[i];
                }
                                                                          
            }
            if(subArray.size() > 0){
                subArrays.add(subArray);
            }
            if(subArrays.size() <= K){
                ans = mid;
                higherBound = mid-1;
            }
            else{
                lowerBound = mid+1;
            }

        }

        return ans;
    }

    public static void main(String arg[]){
        int arr[] = {1, 2, 3, 4};
        int k = 4;
        System.out.println(splitTheGivenArrayIntoKSubarrays(arr, k));
    }
}
