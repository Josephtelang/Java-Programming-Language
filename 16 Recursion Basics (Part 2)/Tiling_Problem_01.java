public class Tiling_Problem_01{
    public static int tiling_problem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }

        //verticle choice
        int fnm1 = tiling_problem(n-1);
        
        //horizontal choice
        int fnm2 = tiling_problem(n-2);

        int total_ways = fnm1 + fnm2;
        return total_ways;
    }
    public static void main(String arg[]){
        System.out.println(tiling_problem(4));

    }
}