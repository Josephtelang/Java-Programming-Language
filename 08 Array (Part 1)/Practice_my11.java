import java.util.Arrays;

public class Practice_my11 {
    public static int Linear_search(int numbers[],int key){
        for(int i = 0 ; i< numbers.length ; i++){
            if (numbers[i] == key ){
                return i;
            }

        }
        return -1;
        
    }

    public static int largest_and_smallest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for ( int i = 0 ; i< numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];

            }

        }
        System.out.println("The largest number is :"+largest);
        return smallest;
    }

    public static int binary_search(int numbers[],int key){
        int start = 0 , end = numbers.length - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if (numbers[mid]>key){
                end = mid - 1;
            }
            else if (numbers[mid]<key){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void reverse_array(int numbers[]){
        int first = 0, last = numbers.length-1;

        while(first <= last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++;
            last --;
        }
        
    }

    public static void pair_in_an_array(int numbers[]){
        int current;
        int tpc = 0;
        for (int i =0 ; i < numbers.length ;i++){
            current = i;
            for ( int j = current + 1 ; j < numbers.length ; j++){
                System.out.print("("+numbers[current]+","+numbers[j]+")");
                tpc +=1;
            }
            System.out.println();
        }
        System.out.println("The total pair count is : "+tpc);
    }

    public static int[] print_subarrays(int numbers[]){
        int sum_of_each_subarray[] = new int[45];
        int counter = 0;
        int tsc = 0;
        for (int i = 0 ; i < numbers.length ; i++){
            
            int start = i;
            for (int j =i ; j < numbers.length ; j++){
                int end = j;
                int sum = 0;
                for (int k = start ; k <= end ; k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k];
                }
                sum_of_each_subarray[counter] = sum;
                counter ++;
                tsc ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays in array is : "+tsc);

       return sum_of_each_subarray;
    }
    public static void main(String arg[]){
        int numbers[] = {2,4,6,8,10,12,13,14,15};
        // int key = 11;

        // int index = Linear_search(numbers,key);

        // if (index == -1){
        //     System.out.println("The key is not in the array means index is : "+index);;
        // }
        // else{
        //     System.out.println("The key index in the array is : "+index);
            
        // }

        // System.out.println("The smallest number in the array is : "+largest_and_smallest(numbers));

        // int index = binary_search(numbers,key);

        // if (index == -1){
        //     System.out.println("The key is not in the array means index is : "+index);
        // }
        // else{
        //     System.out.println("The key index in the array is : "+index);

        // reverse_array(numbers);

        // for (int i =0; i< numbers.length ; i++){
        //     System.out.print(numbers[i]+" ");
        // }
        // System.out.println();
        // System.out.println();


        // pair_in_an_array(numbers);


        System.out.println("The sum of the sub arrays is : "+Arrays.toString(print_subarrays(numbers)));




            
    }



        


}
    

