


public class Largest_and_smallest_in_array06 {
    public static int getLargest_and_smallest(int numbers[]){
        int largest = Integer.MIN_VALUE; // - infinity
        int smallest = Integer.MAX_VALUE; // + infinity
        for (int i = 0 ; i<numbers.length ; i ++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }

            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
            
            
        }

        System.out.println("The smallest value in array is : "+smallest);
        return largest;
    }
    public static void main(String arg[]){
        int numbers[] = {1,2,6,3,5};

        System.out.println("The largest value in array is : "+getLargest_and_smallest(numbers));

    }
    

    
}
