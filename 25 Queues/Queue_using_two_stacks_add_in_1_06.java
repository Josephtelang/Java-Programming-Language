import java.util.Stack;

public class Queue_using_two_stacks_add_in_1_06{
    public static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        // Add 
        public void add(int data){
            s1.push(data);
        }

        // Remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            int top =  s2.pop();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            return top;
        }

        // Peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            int top = s2.peek();

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

            return top;
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