package chapter17hw;



public class Problem_03 {
    public static int inversion_count(int arr[]){
        int count = 0;
        for(int i=0 ; i<arr.length-1 ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    count++;
                }   
            }
        }

        return count;
    }

    public static int inv_count_us_mergeSort(int arr[] ,int si , int ei,int count){
        
        if (si>=ei){
            return count;
        }

        int mid = si + (ei-si)/2;

        count = inv_count_us_mergeSort(arr,si,mid,count);
        count = inv_count_us_mergeSort(arr,mid+1,ei,count);
        count = merge(arr,mid,si,ei,count);
        return count;
        
        
    }
    
    public static int merge(int arr[],int mid , int si , int ei , int count){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid +1;
        int k = 0 ;

        while(i<=mid && j <= ei){
            if(arr[i]> arr[j]){
                temp[k] = arr[j];
                j++; k++;
                count += (mid-i)+1;
            }
            else{
                temp[k] = arr[i];
                i++; k++;
            }
        }

        while(i<=mid){
            temp[k] = arr[i];
            i++; k++;
        }

        while(j<=ei){
            temp[k] = arr[j];
            j++; k++;
        }

        for(k=0 ,i = si ; k<temp.length; k++ , i++){
            arr[i] = temp[k];

        }
        return count;
    }

    public static int merge_sort_mam(int arr[],int left,int right){
        int inv_count =0;
        if (right > left){
            int mid = left + (right - left)/2;
            inv_count = merge_sort_mam(arr,left,mid);
            inv_count += merge_sort_mam(arr,mid+1,right);
            inv_count += merge_mam(arr,left ,mid + 1, right);


        }
        return inv_count;

    }

    public static int merge_mam(int arr[], int left , int mid , int right){
        int temp[] = new int[right - left +1];
        int inv_count = 0 ;
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
                inv_count = mid - i;
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

        return inv_count;

    }
    public static void main(String arg[]){
        int arr[] = {6, 5,3,2,6};
        // int count = 0;
        System.out.println(merge_sort_mam(arr,0,arr.length-1));

    }
    
}
