package Practice_problems_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Beautiful_arrayList_04 {
    public static ArrayList<Integer> beautifulArrayList(int n, int start , boolean used[], ArrayList<Integer> permutationAns){
        
        if(start== n){
            if(isBeautifulArray(permutationAns)){
                return new ArrayList<>(permutationAns); // new ArrayList<>() copies the answer to new array so if you use backtracking first before returning ans the ans will not modify
            }
            
        }

        for(int i = 1; i<=n ; i++){
            if(!used[i]){
                used[i] = true;
                permutationAns.add(i);

                ArrayList<Integer> ans = beautifulArrayList(n,start+1,used,permutationAns);
                
                
                if(!ans.isEmpty()){
                    return ans;
                }
                permutationAns.remove(permutationAns.size()-1);
                used[i] = false;
            }
        }

        return new ArrayList<>();

        

    }
    
    public static boolean isBeautifulArray(ArrayList<Integer> permutationAns){
        int n = permutationAns.size();
        for(int i=0; i<n ; i++){
            int left = permutationAns.get(i);
            for(int j=i+2; j<n ; j++){
                int right = permutationAns.get(j);
                for(int k=i+1 ;k<j ; k++){
                    int middle = permutationAns.get(k);
                    if(2*middle == left + right ){
                        return false;
                    }
                }
            }
        }
        return true;

    }

    public static ArrayList<Integer> isBeautifulArrayOptimized(int n){
        ArrayList <Integer> result = new ArrayList<>();
        // base case
        if(n==1){
            return new ArrayList<>(Arrays.asList(1));
        }

        // for Odd part
        ArrayList<Integer> oddResult = isBeautifulArrayOptimized((n+1)/2);

        // for Even part
        ArrayList<Integer> evenResult = isBeautifulArrayOptimized(n/2);

        
        for(int i=0 ;i<oddResult.size(); i++){
            result.add(2*oddResult.get(i)-1); // 2x - 1 -> for odd

        }
        
    
        for(int i=0 ; i<evenResult.size(); i++){
            result.add(2*evenResult.get(i)); // 2x -> for even
        }
            
        

        return result;

    }
    public static void main(String arg[]){
        int n = 4;
        boolean used[] = new boolean[n+1];
        ArrayList<Integer> permutationAns = new ArrayList<>();
        ArrayList<Integer> result = beautifulArrayList(n, 0,used,permutationAns);
        if(result.isEmpty()){
            System.out.println("No answer found ");
        }
        else{
            System.out.println(result);
        }


        System.out.println(isBeautifulArrayOptimized(n));
        
        
    }
    
}
