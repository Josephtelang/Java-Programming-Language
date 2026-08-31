import java.util.*;
public class Generate_binary_numbers_01 {
    public static void generateBinaryNumber(int n){
        Queue<StringBuilder> q = new ArrayDeque<>();
        generateBinary(n, q);
        
    }
    public static void generateBinary(int n , Queue<StringBuilder> q){
        StringBuilder biString = new StringBuilder("1");
        q.add(biString);
        for(int i = 0 ; i<n ; i++){
            biString = q.remove();
            StringBuilder forZero = new StringBuilder( biString);
            StringBuilder forOne = new StringBuilder( biString);
            System.out.print(biString+" ");
            q.add(forZero.append(0));
            q.add(forOne.append(1));
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N to convert 1 to N binary numbers : ");
        int N = sc.nextInt();
        generateBinaryNumber(N);


    }
    
}
