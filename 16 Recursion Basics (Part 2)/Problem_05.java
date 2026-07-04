public class Problem_05 {            // a to c using b (A , C , B)
    public static void towerOfHanoi(int n , char A, char C , char B){
        if ( n == 0){
            return ;
        }

        towerOfHanoi(n-1, A, B, C);
        System.out.println(A+" to "+C);
        towerOfHanoi(n-1, B,C , A);
    }
    public static void main(String arg[]){
        towerOfHanoi(3 , 'A','C','B');
    }
    
}