public class Problem02 {
    public static int binary_search_in_rotated_array(int num[],int key){
        // int n = num.length-1;
        int pivot_index = num.length-1;
        int counter = 1;
        for(int i = 0 ; i<num.length ; i++){
            if (num.length==1){
                if (num[i] == key){
                    return i;
                }
                else{
                    return -1;
                }
            }
            if(num[i] > i){
                System.out.println(num[i]+" is greater than "+i);
                if (counter == num.length){
                    pivot_index = num.length;
                    // System.out.println(pivot_index);
                    break;
                }
                counter ++;
                
            }
            else{
                pivot_index = i;
                break;
            }
        }
        // if (num.length == counter){
        //     int start = 0;
        //     int end = num.length -1;
            
        //     w
        // }

        int start = 0 ;
        int first_end= pivot_index -1;
        while(first_end >= start){
            int mid = (start + first_end)/2;

            if (num[mid]>key){
                first_end = mid -1;
            }
            else if (num[mid]< key){
                start = mid +1;
            }
            else{
                return mid;
            }
        }

        start = pivot_index;
        int second_end = num.length-1;
        while(second_end >= start){
            int mid = (start + second_end)/2;

            if (num[mid]>key){
                second_end = mid-1;
            }
            else if (num[mid]<key){
                start = mid + 1;
            }
            else{
                return first_end+1 + mid;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int num_1[] = {4,5,6,7,0,1,2};
        int num_2[] = {4,  5, 6, 7, 0, 1, 2};
        int num_3[] = {1};
        int num_4[] = {1,3};
        int num_5[] = {3,1};
        int key= 1;

        int index = binary_search_in_rotated_array(num_5,key);

        if(index == -1){
            System.out.println(-1+" mean that key does not exist in this array ");
        }
        else{
            System.out.println("The index of the key "+key+" is : "+ index);
        }
        
    }
    
}
