package chapter17hw;

// Question 2 :Given an array nums of size n, returnthe majority element. (MEDIUM)
// Themajorityelementistheelementthatappearsmorethan ⌊n/2⌋ times.
//  You may assume that the majority element always exists in the array.
//  Sample Input 1: nums = [3,2,3]
//  Sample Output 1: 3Sample Input 2: nums = [2,2,1,1,1,2,2]
//  Sample Output 2: 2
//  Constraints(extra Conditions):
//  ●n == nums.length
//  ●1 <= n <= 5 * 104
//  ●-109 <= nums[i] <= 109

public class Problem_02 {
    public static void find_mejority(int arr[]){
        int n = arr.length;
        int mejority = -1;
        for(int i = 0 ; i<n ; i++){
            int count = 0;
            for(int j = 0 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    count++;

                }
            }
            if(count>n/2){
                mejority = arr[i];
            }
        }
        System.out.println(mejority);
    }

    public static int mejor_count(int arr[],int num,int lo , int hi){
        int count = 0;
        for(int j = lo ; j<=hi ; j++){
            if(arr[j]==num){
                count++;
            }

        }
        return count;
    }

    public static int find_mejority(int arr[], int lo , int hi){
        // base case
        if(lo>=hi){
            return arr[lo];
        }

        int mid = lo + ( hi -lo)/2;

        int left = find_mejority(arr,lo,mid);
        int right = find_mejority(arr,mid+1,hi);
        
        //check in both half arrays dose they have same mejor element
        if (left==right){
            return left;
        }

        int left_count = mejor_count(arr,left,lo,hi);
        int right_count = mejor_count(arr,right,lo,hi);

        return (left_count>right_count)? left : right;


    }
    public static void main(String arg[]){
        int arr[] = {1, 1, 2, 2, 3,3,3};
        System.out.println(find_mejority(arr,0,arr.length-1));

    }    
    
}
