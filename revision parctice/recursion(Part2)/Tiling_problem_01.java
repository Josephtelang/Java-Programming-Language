
public class Tiling_problem_01 {
    public static void main(String arg[]){
        System.out.println(tillingProblem(4));

    }
    public static int tillingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //kaam
        //vertical 
        int fnm1 = tillingProblem(n-1);

        //horizontal
        int fnm2 = tillingProblem(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;


    }
    
}
