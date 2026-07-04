import java.util.*;

public class Problem05 {
    public static void triplate_array(int array[]){
        int n = array.length;
        // int k = 3;
        // int triplate_subarray_combination = factorial(n)/(factorial(k)*factorial(n-k));
        // int counter = 0;

        // int triplate_arrays[][] = new int[triplate_subarray_combination][k];
        Set<List<Integer>> result = new HashSet<>();
        
        for (int i = 0 ; i <n-2 ; i++){
            for (int j =i+1 ; j<n-1 ; j++){
                for (int l = j+1; l<n ; l++){
                    if ((array[i]+array[j]+array[l])==0){
                        // triplate_arrays[counter] = new int[]{array[i],array[j],array[l]} ;
                        // counter++;
                        List<Integer> triplate = Arrays.asList(array[i],array[j],array[l]);
                        Collections.sort(triplate);
                        result.add(triplate);

                        

                    }
                }
            }
        }
        System.out.println("This is the triplate arrays who's sum is 0 are :"+result);
    }
    public static void main(String[] args) {
        int array[] = {-1, 0,  1, 2, -1, -4};
        // int array[] = {};

        triplate_array(array);
        
    }
    public static int factorial(int n){
        int factorial = 1;
        for (int i = 2 ; i<=n; i++){
            factorial *= i;
        }
        return factorial;

    }
    
}
