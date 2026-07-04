public class Bubble_Sort01{
    public static void bubble_sort(int arr[]){
        int count = 0;
        for (int turns= 0 ; turns<arr.length-1; turns++){
            
            for(int j = 0 ; j<arr.length-1-turns;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count ++;

                }
            }
        }
        if (count == 0){
            System.out.println("The Array is already sorted here count is "+count+" so you no neet sort it ");
        }
    }
    public static void print_sorted_array(int arr[]){
        for (int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String arg[]){
        int arr[] = {5,4,1,3,2};

        bubble_sort(arr);
        print_sorted_array(arr);



    }
}