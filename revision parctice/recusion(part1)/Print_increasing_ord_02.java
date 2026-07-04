

public class Print_increasing_ord_02 {
    public static void main(String arg[]){
        printIncre(5);

    }

    public static void printIncre(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }

        printIncre(n-1);

        System.out.print(n+" ");
    }
    
}
