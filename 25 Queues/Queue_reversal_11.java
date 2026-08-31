import java.util.*;

public class Queue_reversal_11 {
    public static void reverse(Queue<Integer> q){ // TC = O(n) && SC = O(n)
        Stack<Integer> s = new Stack<>();

        while(!q.isEmpty()){
            s.push(q.remove());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String arg[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);

        // Print Q
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
    
}
