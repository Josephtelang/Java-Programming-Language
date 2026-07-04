public class First_Occurrence_07 {
    public static int first_Occ(int arr[],int key,int i){
        if ( i == arr.length){
            return -1;
        }
        if ( arr[i]== key){
            return i;
        }

        return first_Occ(arr,key,i+1);

    }
    public static void main(String arg[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};

        System.out.println(first_Occ(arr,5,0));

    }
    
}
