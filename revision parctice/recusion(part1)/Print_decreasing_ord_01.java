
public class Print_decreasing_ord_01 {
    public static void main(String arg[]){
        printDec(10);

    }

    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }

        System.out.print(n+" ");
        printDec(n-1);

    }
    
}
