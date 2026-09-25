package Practice_problem_10;
import java.util.*;

public class Kth_largest_odd_number_in_range_02 {
    public static int Kth_largest_odd_number_in_range(int L, int R, int K){ // TC = O(L->R) : for loop , SC=O(odd number in range(L->R))
        ArrayList<Integer> oddDescending = new ArrayList<>();
        for(int i=R ; i>=L ; i--){
            if(i%2 != 0){
                oddDescending.add(i);
            }
        }

        if(K > oddDescending.size()){
            return 0;
        }

        return oddDescending.get(K-1);

    }

    public static int Kth_largest_odd_number_in_range_Optimized(int L , int R , int K){ // TC = O(odd number in range(L->R)) : while loop , SC=O(1)
        int largestOdd = R;
        
        if(R%2 == 0){
            largestOdd = R-1;
        }

        int i =1 ;
        int currlargestOdd = largestOdd - 2*(i-1);
        while(currlargestOdd >= L){
            
            
            if(i == K){
                return currlargestOdd;
            }
            i++;
            currlargestOdd = largestOdd - 2*(i-1);
        }
        
        return 0;
    }

    public static int Kth_largest_odd_number_in_range_best_Optimized(int L , int R , int K){
        int largestOdd = R;
        if(R%2 == 0){
            largestOdd = R - 1;
        }

        int KthLargestOdd = largestOdd - (2*(K-1));

        if(KthLargestOdd >= L){
            return KthLargestOdd;
        }

        return 0;
    }

    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 'L' for start of range : ");
        int L = sc.nextInt();
        System.out.println("Enter the number 'R' for end of range : ");
        int R = sc.nextInt();
        System.out.println("Enter the number 'K' for Kth largest in range : ");
        int K = sc.nextInt();
        System.out.println("Kth largest odd number in range 'L' to 'R' inclusive is : "+Kth_largest_odd_number_in_range(L,R,K));
        System.out.println("Kth largest odd number in range 'L' to 'R' inclusive is : "+Kth_largest_odd_number_in_range_Optimized(L,R,K));
        System.out.println("Kth largest odd number in range 'L' to 'R' inclusive is : "+Kth_largest_odd_number_in_range_best_Optimized(L,R,K));
    }
    
}
