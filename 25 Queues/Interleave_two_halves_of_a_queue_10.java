import java.util.*;

public class Interleave_two_halves_of_a_queue_10{
    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstHalve = new LinkedList<>();
        int n = q.size();

        for(int i=0 ; i<n/2 ; i++){
            firstHalve.add(q.remove());
        }

        while(!firstHalve.isEmpty()){
            q.add(firstHalve.remove());
            q.add(q.remove());
        }

    }

    public static void main(String arg[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        // Print Queue
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}