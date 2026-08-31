import java.util.*;

public class Implement_Queue_using_Deque_14 {
    public static class Queue{
        Deque<Integer> deque = new ArrayDeque<>();

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        public void add(int data){
            deque.addLast(data);
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return deque.removeFirst();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return deque.getFirst();
        }
    }
    public static void main(String arg[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
