public class Merge_Sort_01{
    public static void printArray(int arr[]){
        for ( int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge_sort(int arr[], int si , int ei){
        //base
        if (si >= ei){
            return;
        }

        //kaam
        int mid = si + (ei - si)/2;

        merge_sort(arr,si,mid);  //left part
        merge_sort(arr,mid+1,ei); //right part
        merge(arr,si,mid,ei); //merging process
    }

    public static void merge(int arr[], int si , int mid , int ei){
        // right_arr(0,3)->4 elem    left_arr(4,6)->3 elem  == 6-0+1 = 7 elem
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0 ;

        while(i<=mid && j <=ei){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }
            else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        
        //left over element of the first sorted part
        while(i<=mid){
            // temp[k] = arr[i];
            // i++; k++;

            // same as above

            temp[k++] = arr[i++];

        }

        //left over element of the second sorted part
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        // copy the temp in to the original array
        for(k=0 , i = si ; k<temp.length ;k++ , i++){
            arr[i] = temp[k];

        }
    }

    public static void main(String arg[]){
        int arr[] = {6,3,9,5,8,-2,2,8}; 
        merge_sort(arr,0,arr.length-1);
        printArray(arr);

    }
}