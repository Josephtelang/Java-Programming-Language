public class Binary_Search07 {

    public static int binary_search(int numbers[], int key){
        int start = 0 , end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end )/2;

            // comparision
            if (numbers[ mid] == key){
                return mid;
            }
            else if (numbers[mid] < key){//right search
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = binary_search(numbers,key);
        if(index == -1){
            System.out.println("The key does not exist in array");
        }
        else{
            System.out.println("The index of key in array is : "+index );
        }

        


    }
    
}
