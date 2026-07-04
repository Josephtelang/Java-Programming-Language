public class Insertion_Sort03 {
    public static void insertion_sort(int arr[]){
        for (int i= 1; i< arr.length;i++){
            int curr = arr[i];
            int prev = i-1;

            while ( prev>=0 && arr[prev]>curr){  // if we change the arrow > to < it will give the decending order
                arr[prev+1] = arr[prev];
                prev --;
            }

            arr[prev+1] = curr;

        }
    }

    public static void print_sorted_array(int arr[]){
        for (int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String arg[]){
        int arr[] = {5,4,1};

        insertion_sort(arr);
        print_sorted_array(arr);
    }
    
}
