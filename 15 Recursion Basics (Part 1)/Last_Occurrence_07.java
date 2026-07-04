public class Last_Occurrence_07 {
    public static int Last_Occ(int arr[],int key, int i){
        if ( i == arr.length){
            return -1;
        }
        int is_found = Last_Occ(arr, key, i+1);

        if (is_found == -1 && arr[i]==key){
            return i;
        }

        return is_found;

    }
    public static void main(String arg[]){
        int arr[] = {8,3,6,9,5,0,2,5,3};

        System.out.println(Last_Occ(arr,5,0));

        
    }
    
}
