import java.util.LinkedList; // JCF -> Optimized

public class LL_in_Collections_framework_03 {
    public static void main(String arg[]){
        // Create - does not store premitive data types (int , float , boolean) -> stores Objects (Integer , Float , String ,Boolean)
        LinkedList<Integer> ll = new LinkedList<>();

        // Add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        
        // Remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
    
}
