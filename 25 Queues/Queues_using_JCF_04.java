import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;


public class Queues_using_JCF_04 {
    public static void main(String arg[]){
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }


    // Home work : diference between LindedList and ArrayDeque
    
}
