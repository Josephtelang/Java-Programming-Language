import java.util.Stack;

public class Queue_using_two_stacks_add_in_n_05 {  
    public static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        // Add  -> O(n)
        public void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        // Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.pop();
        }

        // Peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return s1.peek();
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
