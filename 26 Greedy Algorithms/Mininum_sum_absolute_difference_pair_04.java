import java.util.Arrays;

public class Mininum_sum_absolute_difference_pair_04 {
    public static void main(String arg[]){  // O(n logn)
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);   // O(n logn)
        Arrays.sort(B);   // O(n logn)
        
        int miniDiff = 0 ;
        for(int i=0 ; i<A.length ; i++){
            miniDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("minimum absolute difference : "+miniDiff);
    }
    
}
