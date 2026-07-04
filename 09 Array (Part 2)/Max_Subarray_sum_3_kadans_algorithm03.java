public class Max_Subarray_sum_3_kadans_algorithm03{
    public static void kadans(int numbers[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        // int negetive_array[] = new int[8];
        int count =0;

        for (int i =0 ; i< numbers.length ; i++){
            cs = cs + numbers[i];
            
            if (numbers[i] <0){
                count ++; 
            }
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
            
        }
        if (count == numbers.length){
            ms = Integer.MIN_VALUE;
            for (int j =0 ; j< numbers.length; j++){
                    
                        
                    if (ms < numbers[j]){
                       ms =Math.max( ms ,numbers[j]);
                    }
                    
                    
                    
            }
        }
 
        System.out.println("The max sub array sum is : "+ms);
    }
    
    public static void main(String arg[]){
        int numbers[] = {-2,-3,4,1,-2,-1,5,-3};

        kadans(numbers);
    }
}