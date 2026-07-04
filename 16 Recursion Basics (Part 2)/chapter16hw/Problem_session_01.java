package chapter16hw;

public class Problem_session_01{
    public static int k_th_symbole_in_grammer(int n, int k){
        //base case

        if (k==1){
            return 0;
        }

        int parent = k_th_symbole_in_grammer(n-1, (k+1)/2);

        if(parent== 0){
            if(k%2==1){ //first child
                return 0;
            }
            else{
                return 1;
            }
        }
        else { // parent == 1
            if(k%2==1){ //first child
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    public static void main(String arg[]){
        System.out.println(k_th_symbole_in_grammer(3,2));


    }
}