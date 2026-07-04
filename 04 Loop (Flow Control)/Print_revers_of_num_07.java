public class Print_revers_of_num_07 {
    public static void main(String arg[]){
        int n = 10899;
        while(n>0){
            int lastdigit = n%10;

            System.out.print(lastdigit);

            n  = n/10;

        }
       
    }
    
}
