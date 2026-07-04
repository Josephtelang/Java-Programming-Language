package chapter17hw;

public class problem_session_03 {
    static int inv_count = 0;
        public static void merge_sort_mam(int arr[],int left,int right){
        
        if (right > left){
            int mid = left + (right - left)/2;
            merge_sort_mam(arr,left,mid);
            merge_sort_mam(arr,mid+1,right);
            merge_mam(arr,left ,mid + 1, right);


        }
        

    }

    public static void merge_mam(int arr[], int left , int mid , int right){
        int temp[] = new int[right - left +1];
        // int inv_count = 0 ;
        int i = left;
        int j = mid;
        int k = 0 ;

        while (i<mid && j<= right){
            if(arr[j] >= arr[i]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                inv_count += mid - i;
                j++;
                k++;
                
            }



        }
        while(i<mid){
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j<=right){
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (k=0 , i = left ; k<temp.length ; i++ , k++ ){
            arr[i] = temp[k];
        }

        

    }
    public static void main(String arg[]){
        int arr[] = {6, 5,3,2,6};
        int inv_count = 0;
        merge_sort_mam(arr,0,arr.length-1);
        System.out.print(inv_count);

    }
    

    
}
