public class Counting_Sort05 {
    public static void Counting_Sort(int arr[]){
        int max_range = Integer.MIN_VALUE;
        for (int i=0 ; i<arr.length; i++){
            max_range = Math.max(arr[i],max_range);
        }

        int count[] = new int[max_range+1];
        for (int i = 0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }

        int j = 0 ;
        for ( int i=0; i<count.length ; i++){
            while(count[i]> 0){
                arr[j] = i;
                count[i] --;
                j ++;

            }

        }

    }
    public static void print_sorted_array(int arr[]){
        for ( int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println(("joseph").length());
    }
    public static void main(String arg[]){
        int arr[] = {1,4,1,3,2,4,3,5};

        Counting_Sort(arr);
        print_sorted_array(arr);
    }
    
}
