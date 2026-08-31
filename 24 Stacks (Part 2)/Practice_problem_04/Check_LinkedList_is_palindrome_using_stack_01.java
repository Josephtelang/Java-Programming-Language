package Practice_problem_04;
import java.util.Stack;
public class Check_LinkedList_is_palindrome_using_stack_01{
    public static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // Add First Method
    public void addFirst(char data){
        // Step 1 -> Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 -> newNode next = head
        newNode.next = head; // link

        // Step 3 -> head = newNode
        head = newNode;


    }
    
    // Add Last
    public void addLast(char data){
        // Step 1 -> Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step 2 -> tail next = newNode
        tail.next = newNode; // link

        // Step 3 -> tail = newNode
        tail = newNode;
    }

    // Print a LinkedList
    public void print(){  // O(n)
        Node temp = head;
        if(temp == null){
            System.out.print("Linked list is empty");
        }
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    // Add in middle of LL
    public void add(int idx,char data){
        if(idx == 0 ){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        
        while(i < idx-1){
            temp = temp.next;
            i++;

        }

        // i = idx-1 -> tem = prev
        newNode.next = temp.next;
        temp.next = newNode;
        if(idx == size-1){
            tail = newNode;
        }
        

    }

    // Remove first
    public char removeFirst(){
        if(size == 0){
            System.out.println("Linked List is empty ");
            return '\0';
        }
        else if(size == 1){
            char val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        char val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Remove Last
    public char removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return '\0';
        }
        else if(size==1){
            char val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        // prev : i = size - 2 
        Node prev = head;
        for(int i=0 ; i < size - 2 ; i++){
            prev = prev.next;
        }

        char val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static boolean isPalindrome(Check_LinkedList_is_palindrome_using_stack_01 ll){
        Stack<Character> s = new Stack<>();
        if(ll.head == null){
            return true;
        }
        Node slow = ll.head;
        Node fast = ll.head.next;

        while(fast!=null && fast.next != null){
            s.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;

        }

        if(fast == null){
            slow = slow.next;
        }
        else{ // fast != null
            s.push(slow.data);
            slow = slow.next;
        }

        while(slow != null){
            if(s.peek() != slow.data){
                return false;
            }
            s.pop();
            slow = slow.next;
        }
        return true;
    }
    public static void main(String arg[]){
        Check_LinkedList_is_palindrome_using_stack_01 ll = new Check_LinkedList_is_palindrome_using_stack_01();
        ll.addFirst('A');
        ll.addFirst('B');
        // ll.addFirst('C');
        ll.addFirst('B');
        ll.addFirst('A');
        System.out.println(isPalindrome(ll));


    }
    
}
