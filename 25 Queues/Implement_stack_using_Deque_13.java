import java.util.*;

public class Implement_stack_using_Deque_13 {
    public static class Stack{
        Deque<Integer> deque = new ArrayDeque<>();

        public boolean isEmpty(){
            return deque.isEmpty();
        }

        public void push(int data){
            deque.addLast(data);
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.removeLast();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.getLast();
        }

    }
    public static void main(String arg[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
