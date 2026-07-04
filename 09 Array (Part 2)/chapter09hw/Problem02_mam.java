import java.util.Arrays;
public class Problem02_mam {
    public static int search_in_rotat_array(int num[],int target){


        int mini = mini_search(num);
        int result ;

        if (target >= num[mini] && target <= num[num.length-1]){
            result = binary_search(num,mini,num.length-1,target);  //right half
        }
        else{
            result = binary_search(num,0,mini-1,target); //left half
        }

        return result;
        

        
    }
    public static int binary_search(int num[],int left,int right ,int target ){
        while(left <= right){
            int mid = left + (right - left)/2;

            if (num[mid]>target){
                right = mid -1;
            }
            else if (num[mid]<target){
                left = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int mini_search(int num[]){
        int left = 0;
        int right = num.length-1;

        while(left < right){
            int mid = left + (right-left)/2;

            if (mid>0 && num[mid -1 ] > num[mid]){
                return mid;
            }
            else if (num[left]<=num[mid] && num[mid]>num[right]){
                left = mid + 1;
            }
            else{

                right = mid - 1;

            }

            
        }
        return left;
    }

    
    public static void main(String arg[]){
        int num_1[] = {4,5,6,7,0,1,2};
        int target= 0;
        int num_2[] = {1};
        
        int index = search_in_rotat_array(num_1, target);
        if (index == -1){
            System.out.print("There is no "+target+" in the array : "+Arrays.toString(num_1));
        }
        else{
            System.out.print("The index of "+target+" in the array : "+Arrays.toString(num_1)+" is : "+index);
        }
    }
}
