public class loop_sample_01{
    public static void main(String arg[]){
        int n= 3;
        for (int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.println(i);
                System.out.println(j);
            }
        }
    }
}