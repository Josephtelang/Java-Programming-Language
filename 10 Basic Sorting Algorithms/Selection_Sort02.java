public class Selection_Sort02 {
    public static void Selection_sort(int arr[]){
        for (int i = 0 ; i < arr.length-1 ; i++){
            int min_position = i;
            for (int j = i+1; j < arr.length ; j++){
                if (arr[min_position] > arr[j]){ // if we change the arrow > to < the it will decending order array 
                    min_position = j;
                }

            }
            int temp = arr[min_position];
            arr[min_position]  = arr[i];
            arr[i] = temp;
        }
    }

    public static void print_sorted_array(int arr[]){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String arg[]){
        int arr[] = {5,4,5,3,1,3,2};

        Selection_sort(arr);
        print_sorted_array(arr);

        
    }
    
}
