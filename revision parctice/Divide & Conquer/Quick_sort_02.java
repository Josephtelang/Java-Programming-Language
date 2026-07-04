public class Quick_sort_02 {
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[], int si , int ei){
        //base case 
        if (si>= ei){
            return;
        }

        //last element
        int pIdx = partition(arr,si,ei);

        //left part
        quickSort(arr,si,pIdx-1);  //we can't use == because partition changes pIdx 
                                   // which changes ei so we can use == as merge sort
        
        //right part
        quickSort(arr,pIdx+1,ei);

    }

    public static int partition(int arr[], int si, int ei){
        //pivot
        int pivot = arr[ei];
        int i = si-1; // to make place for elements smaller than pivot

        for(int j = si ; j<=ei ; j++){
            if(arr[j] <= pivot){
                // swap
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        return i;


    }


    public static void main(String arg[]){
        int array[] = {6,3,9,5,2,5,8,-2};
        quickSort(array,0,array.length-1);
        printArr(array);


    }
    
}
